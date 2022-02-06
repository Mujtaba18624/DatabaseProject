package databaseproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class New_Card extends javax.swing.JFrame {
    
    JFrame f = new JFrame();
    
    
    
    Connection con;
    String BN = "";
    int CID = 1;

    public New_Card() {
        initComponents();
        con = db_connection.getConnection();

        try {
            String Str_Query = "Select DISTINCT BANK_NAME FROM CARD";
            PreparedStatement ps = con.prepareStatement(Str_Query);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                BN = resultSet.getString("BANK_NAME");
                Bank.addItem(BN);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            String Str_Query = "Select CARD_TYPE FROM CARD where BANK_NAME=?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            BN = Bank.getSelectedItem().toString();
            ps.setString(1, BN);

            cardType.removeAllItems();
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                cardType.addItem(resultSet.getString("CARD_TYPE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        admin2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin3 = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        admin6 = new javax.swing.JLabel();
        Bank = new javax.swing.JComboBox<String>();
        admin7 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        cardNo = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        admin8 = new javax.swing.JLabel();
        cardType = new javax.swing.JComboBox<String>();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAM VIRTUAL MART");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 13, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer(80).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delivering Low-Cost and High-Quality Goods Right at Your Doorstep");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        admin2.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin2.setText("CUSTOMER");
        admin2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/card(80).png"))); // NOI18N
        jLabel2.setText("ENTER CARD DETAILS");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        admin3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin3.setText("ENTER EXPIRY DATE:");
        admin3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        checkout.setBackground(new java.awt.Color(0, 102, 153));
        checkout.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("ADD CARD");
        checkout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        checkout.setContentAreaFilled(false);
        checkout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        checkout.setOpaque(true);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        BackgroundPanel.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 280, 60));

        admin6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin6.setText("CARD NO");
        admin6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        Bank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BankMouseClicked(evt);
            }
        });
        Bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankActionPerformed(evt);
            }
        });
        Bank.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BankPropertyChange(evt);
            }
        });
        Bank.setBackground(Color.WHITE);
        BackgroundPanel.add(Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 230, 40));

        admin7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin7.setText("SELECT BANK");
        admin7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));
        BackgroundPanel.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 200, 40));

        cardNo.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        cardNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNoActionPerformed(evt);
            }
        });
        BackgroundPanel.add(cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 230, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 130, 90));

        admin8.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin8.setText("SELECT CARD TYPE:");
        admin8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        cardType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTypeActionPerformed(evt);
            }
        });
        Bank.setBackground(Color.WHITE);
        BackgroundPanel.add(cardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 230, 40));

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

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed

        if(cardNo.getText().equals("")){
            JOptionPane.showMessageDialog(f, "Please enter Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);
           
        }else if(jDateChooser4.getDate() == null){
            JOptionPane.showMessageDialog(f, "Please choose Expiry Date", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String Str_Query = "Select CARD_ID from CARD where BANK_NAME=? AND CARD_TYPE=?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, Bank.getSelectedItem().toString());
            ps.setString(2, cardType.getSelectedItem().toString());

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int CI = resultSet.getInt("CARD_ID");

                String Str1_Query = "INSERT INTO CUSTOMER_PAYMENT (CUSTOMER_ID, ACCOUNT_NO, CARD_ID, EXPIRY)"
                        + " VALUES (?,?,?,?)";

                PreparedStatement ps1 = con.prepareStatement(Str1_Query);
                ps1.setInt(1, CID);
                ps1.setString(2, cardNo.getText());
                ps1.setInt(3, CI);
                java.sql.Date sqlDate = new java.sql.Date(jDateChooser4.getDate().getTime());
                ps1.setDate(4, sqlDate);

                int resultSetInt = ps1.executeUpdate();
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "CARD added succesfully", "Message", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void BankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankActionPerformed
        try {
            String Str_Query = "Select CARD_TYPE FROM CARD where BANK_NAME=?";
            PreparedStatement ps1 = con.prepareStatement(Str_Query);
            BN = Bank.getSelectedItem().toString();
            ps1.setString(1, BN);

            cardType.removeAllItems();
            ResultSet resultSet = ps1.executeQuery();
            while (resultSet.next()) {
                cardType.addItem(resultSet.getString("CARD_TYPE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BankActionPerformed

    private void cardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:

        JFrame newMain = new Customer_Checkout();
        newMain.setVisible(true);
        newMain.setResizable(false);
    }//GEN-LAST:event_backActionPerformed

    private void cardTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTypeActionPerformed


    }//GEN-LAST:event_cardTypeActionPerformed

    private void BankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankMouseClicked
        try {

            String Str_Query = "Select CARD_TYPE FROM CARD where BANK_NAME=?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            BN = Bank.getSelectedItem().toString();
            ps.setString(1, BN);

            cardType.removeAllItems();
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                cardType.addItem(resultSet.getString("CARD_TYPE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BankMouseClicked

    private void BankPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BankPropertyChange


    }//GEN-LAST:event_BankPropertyChange

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
            java.util.logging.Logger.getLogger(New_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        JFrame newMain = new New_Card();
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JComboBox<String> Bank;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel admin3;
    private javax.swing.JLabel admin6;
    private javax.swing.JLabel admin7;
    private javax.swing.JLabel admin8;
    private javax.swing.JButton back;
    private javax.swing.JTextField cardNo;
    private javax.swing.JComboBox<String> cardType;
    private javax.swing.JButton checkout;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
