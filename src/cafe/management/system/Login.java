/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

//import dao.UserDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
//import model.User;

/**
 *
 * @author Siddhesh
 */
public class Login extends javax.swing.JFrame 
{
    public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form Login
     */
    public Login() 
    {
        initComponents();
        btnLogin.setEnabled(false);
    }
    
    public void clear()
    {
        txtEmail.setText("");
        txtPassword.setText("");
        btnLogin.setEnabled(false);
    }
    
    public void validateFields()
    {
        String email=txtEmail.getText();
        String password=txtPassword.getText();
        if(email.matches(emailPattern) && !password.equals(""))
        {
            btnLogin.setEnabled(true);
        }
        else
        {
            btnLogin.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnForgetPass = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(153, 0, 51));
        lblLogin.setText("LOGIN");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email ");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Pasword");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 360, -1));

        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 360, -1));

        btnLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogin.setForeground(java.awt.Color.white);
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setForeground(java.awt.Color.white);
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setForeground(java.awt.Color.white);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, -1, -1));

        btnForgetPass.setBackground(new java.awt.Color(51, 51, 51));
        btnForgetPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnForgetPass.setForeground(java.awt.Color.white);
        btnForgetPass.setText("Forget Password ?");
        btnForgetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgetPassActionPerformed(evt);
            }
        });
        getContentPane().add(btnForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        btnSignup.setBackground(new java.awt.Color(51, 51, 51));
        btnSignup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSignup.setForeground(java.awt.Color.white);
        btnSignup.setText("SignUp");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 90, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/first page background.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","rootpassword");
            String sql = "Select * from signup where email=? and password=?";
            PreparedStatement ps = con.prepareCall(sql); 
            ps.setString(1, txtEmail.getText());
            ps.setString(2, txtPassword.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Email & Password Matched");
                Home hm = new Home();
                hm.setVisible(true);
                setVisible(false);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Email & Password Not Matched");
                txtEmail.setText(" ");
                txtPassword.setText(" ");

            }
            con.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
        
        
       /* String email=txtEmail.getText();
        String password=txtPassword.getText();
        User user=null;
        user=UserDao.login(email, password);
        if(user==null)
        {
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:red\">Incorrect Username or Password</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(user.getStatus().equals("false"))
            {
                ImageIcon icon=new ImageIcon("src/popupicon/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b>Wait for Admin Approval</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
                clear();
            }
            if(user.getStatus().equals("true"))
            {
                setVisible(false);
                new Home(email).setVisible(true);
            }
        }*/
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to Close Application ?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnForgetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgetPassActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgetPassword().setVisible(true);
    }//GEN-LAST:event_btnForgetPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForgetPass;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}


//# .........................................
//
//# Project Name : S-Mart Management System 
//# Language Used : Java 
//# Database : MYSQL
//# Developed By : Siddheshwar Koli | Atharva Walke
//# Contact By : siddheshwarkoli10@gmail.com
//
//# .........................................
