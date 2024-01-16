/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author athrv
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobileno,address,password,securityQuestion,answer,status) values('" + user.getNm() + "','" + user.getEmail() + "','" + user.getMobno() + "','" + user.getAdd() + "','" + user.getPassword() + "','" + user.getSque() + "','" + user.getAns() + "','false')";
        DbOperations.setDataorDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSque(rs.getString("securityQuestion"));
                user.setAns(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password='" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataorDelete(query,"Password Chnaged Successfully..!");
    }
    
    public static ArrayList<User> getAllRecords(String email)
    {
        ArrayList<User> arrayList=new ArrayList<>();
        try
        {
            ResultSet rs=DbOperations.getData("select *from user where email like'%"+email+"%'");
            while(rs.next())
            {
                User user=new User();
                user.setId(rs.getInt("id"));
                user.setNm(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobno(rs.getString("mobileNumber"));
                user.setAdd(rs.getString("address"));
                user.setSque(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void chnageStatus(String email,String status)
    {
        String query="update user set status='"+status+"' where email='"+email+"'";
        DbOperations.setDataorDelete(query,"Status Changed Successfully");
    }
    
    public static void chnagePassword(String email,String oldPassword,String newPassword)
    {
        try
        {
            ResultSet rs=DbOperations.getData("select *from user where email='"+email+"' and password='"+oldPassword+"'");
            if(rs.next())
            {
                update(email, newPassword);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Old Password is Wrong");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public static void chnageSecurityQuestion(String email,String password,String securityQuestion,String answer)
    {
        try
        {
            ResultSet rs=DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            if(rs.next())
            {
                update(email, securityQuestion, answer);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password is Wrong");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public static void update(String email,String securityQuestion,String answer)
    {
        String query="update userset securityQuestion='"+securityQuestion+"',answer='"+answer+"' where email='"+email+"'";
        DbOperations.setDataorDelete(query,"Security Question Changed Successfully");
    }
    {
        
    }
}
