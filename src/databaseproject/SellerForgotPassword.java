/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Void
 */
public class SellerForgotPassword extends javax.swing.JFrame {

    //Boolean isVisible = true;
    
    
    public SellerForgotPassword() {
        initComponents();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admin2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        validate = new javax.swing.JButton();
        admin5 = new javax.swing.JLabel();
        admin8 = new javax.swing.JLabel();
        SecurityAnswer = new javax.swing.JTextField();
        admin10 = new javax.swing.JLabel();
        admin12 = new javax.swing.JLabel();
        SecurityQuestion = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ResetPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setFocusable(false);
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAM VIRTUAL MART");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 13, -1, -1));

        admin.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seller(80).png"))); // NOI18N
        admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, -1));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to your most trusted online market place");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 113, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delivering Low-Cost and High-Quality Goods Right at Your Doorstep");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        admin2.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin2.setText("SELLER");
        admin2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel2.setText("FORGOT PASSWORD ?");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        validate.setBackground(new java.awt.Color(0, 102, 153));
        validate.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        validate.setForeground(new java.awt.Color(255, 255, 255));
        validate.setText("VALIDATE");
        validate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        validate.setContentAreaFilled(false);
        validate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        validate.setOpaque(true);
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        BackgroundPanel.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 180, 50));

        admin5.setFont(new java.awt.Font("Nirmala UI", 1, 35)); // NOI18N
        admin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin5.setText("EMAIL");
        admin5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        admin8.setFont(new java.awt.Font("Nirmala UI", 1, 35)); // NOI18N
        admin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin8.setText("SECURITY QUESTION");
        admin8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        SecurityAnswer.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        SecurityAnswer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SecurityAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityAnswerActionPerformed(evt);
            }
        });
        BackgroundPanel.add(SecurityAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 510, 50));

        admin10.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/securityQuestion(50).png"))); // NOI18N
        admin10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 60, 50));

        admin12.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email(50).png"))); // NOI18N
        admin12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 60, 50));

        SecurityQuestion.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        SecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name of your first pet?", "Elementary school did you attend?", "Name of your birth city?" }));
        SecurityQuestion.setBorder(null);
        SecurityQuestion.setFocusable(false);
        SecurityQuestion.setOpaque(false);
        SecurityQuestion.setBackground(Color.WHITE);
        BackgroundPanel.add(SecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 510, 50));

        email.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        BackgroundPanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 510, 50));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 130, 90));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel6.setText("Provide your account's email and security question/answer for which you want to Reset Password ");
        BackgroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/forgotPassword(70).png"))); // NOI18N
        BackgroundPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 80));

        ResetPassword.setBackground(new java.awt.Color(0, 102, 153));
        ResetPassword.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        ResetPassword.setForeground(new java.awt.Color(255, 255, 255));
        ResetPassword.setText("RESET PASSWORD");
        ResetPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ResetPassword.setContentAreaFilled(false);
        ResetPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ResetPassword.setOpaque(true);
        ResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPasswordActionPerformed(evt);
            }
        });
        BackgroundPanel.add(ResetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 270, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validateActionPerformed

    private void SecurityAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecurityAnswerActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPasswordActionPerformed
        // TODO add your handling code here:
        new SellerResetPassword().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ResetPasswordActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Seller().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    
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
            java.util.logging.Logger.getLogger(SellerForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
        JFrame newMain = new SellerForgotPassword();
        newMain.setTitle("STAM Virtual Mart");
        newMain.setVisible(true);
        newMain.setResizable(false);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton ResetPassword;
    private javax.swing.JTextField SecurityAnswer;
    private javax.swing.JComboBox<String> SecurityQuestion;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin10;
    private javax.swing.JLabel admin12;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel admin5;
    private javax.swing.JLabel admin8;
    private javax.swing.JButton back;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
