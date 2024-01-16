/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Siddhesh
 */
public class Home extends javax.swing.JFrame {
    
    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@gmail.com")) {
           
            btnNewProduct.setVisible(false);
            btnVEDProduct.setVisible(false);
            //btnVerifyUsers.setVisible(false);
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

        btnLogout = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        btnViewBillOrderDtls = new javax.swing.JButton();
        btnChangeSque = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnVEDProduct = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 260, -1));

        btnChangePass.setBackground(new java.awt.Color(0, 0, 0));
        btnChangePass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangePass.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangePass.setText("Change Password");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, -1));

        btnViewBillOrderDtls.setBackground(new java.awt.Color(0, 0, 0));
        btnViewBillOrderDtls.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewBillOrderDtls.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBillOrderDtls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewBillOrderDtls.setText("View Bill & Order Placed Details");
        btnViewBillOrderDtls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillOrderDtlsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillOrderDtls, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        btnChangeSque.setBackground(new java.awt.Color(0, 0, 0));
        btnChangeSque.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangeSque.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeSque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        btnChangeSque.setText("Change Security Question ");
        btnChangeSque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 260, -1));

        btnNewProduct.setBackground(new java.awt.Color(0, 0, 0));
        btnNewProduct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("Add New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        btnVEDProduct.setBackground(new java.awt.Color(0, 0, 0));
        btnVEDProduct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVEDProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnVEDProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnVEDProduct.setText("View,Edit & Delete Product");
        btnVEDProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVEDProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnVEDProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        btnPlaceOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnPlaceOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/burger.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 680));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnVEDProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVEDProductActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnVEDProductActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        //new PlaceOrder(email).setVisible(true);
        
        new Ordernew().setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnViewBillOrderDtlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillOrderDtlsActionPerformed
        // TODO add your handling code here:
        new ViewBillOrderPlacedDtls().setVisible(true);
    }//GEN-LAST:event_btnViewBillOrderDtlsActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnChangeSqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSqueActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSqueActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnChangeSque;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVEDProduct;
    private javax.swing.JButton btnViewBillOrderDtls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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
