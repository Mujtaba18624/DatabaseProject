/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

/**
 *
 * @author Void
 */
public class Customer_AddAddress extends javax.swing.JFrame {

    //Boolean isVisible = true;
    Connection con;
    int CID = 1;
    
    JFrame f = new JFrame();


    public Customer_AddAddress() {
        initComponents();
        con = db_connection.getConnection();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        addToCart = new javax.swing.JButton();
        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin6 = new javax.swing.JLabel();
        admin7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        admin10 = new javax.swing.JLabel();
        admin11 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        postalCode = new javax.swing.JTextField();
        addAddress = new javax.swing.JButton();
        back = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setActionCommand("P1\np2\np3");
        menuBar3.add(menu5);

        menu6.setActionCommand("P1\np2\np3");
        menuBar3.add(menu6);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        addToCart.setBackground(new java.awt.Color(0, 77, 64));
        addToCart.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setText("Add to cart");
        addToCart.setBorder(null);
        addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD ADDRESS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 60));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));

        admin6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin6.setText("City");
        admin6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        admin7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin7.setText("Address");
        admin7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        address.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 620, 50));

        admin10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin10.setText("Country");
        admin10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        admin11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin11.setText("Postal Code");
        admin11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        city.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        city.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 250, 30));

        country.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        country.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 250, 30));

        postalCode.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        postalCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(postalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, 30));

        addAddress.setBackground(new java.awt.Color(0, 102, 153));
        addAddress.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        addAddress.setForeground(new java.awt.Color(255, 255, 255));
        addAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/address(30).png"))); // NOI18N
        addAddress.setText("ADD ADDRESS");
        addAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addAddress.setContentAreaFilled(false);
        addAddress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addAddress.setOpaque(true);
        addAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAddressActionPerformed(evt);
            }
        });
        BackgroundPanel.add(addAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 260, -1));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 520, 130, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed

    }//GEN-LAST:event_addToCartActionPerformed

    private void addAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAddressActionPerformed

        if (address.getText().equals("") || postalCode.getText().equals("") || city.getText().equals("") || country.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Please fill all fields.", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else {
            try {
                String Str_Query = "INSERT INTO CUSTOMER_ADDRESS (CUSTOMER_ID, ADDRESS , POSTAL_CODE , CITY, COUNTRY)"
                        + " VALUES (?,?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(Str_Query);
                ps.setInt(1, CID);
                ps.setString(2, address.getText());
                ps.setString(3, postalCode.getText());
                ps.setString(4, city.getText());
                ps.setString(5, country.getText());

                int resultSetInt = ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Item Succussfully Added to CART", "Message", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_addAddressActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Customer_Checkout().setVisible(true);
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
            java.util.logging.Logger.getLogger(Customer_AddAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_AddAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_AddAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_AddAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        JFrame newMain = new Customer_AddAddress();
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton addAddress;
    private javax.swing.JButton addToCart;
    private javax.swing.JTextField address;
    private javax.swing.JLabel admin10;
    private javax.swing.JLabel admin11;
    private javax.swing.JLabel admin6;
    private javax.swing.JLabel admin7;
    private javax.swing.JButton back;
    private javax.swing.JTextField city;
    private javax.swing.JTextField country;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private javax.swing.JTextField postalCode;
    // End of variables declaration//GEN-END:variables
}
