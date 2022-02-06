/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Void
 */
public class Customer_ShoppingCart extends javax.swing.JFrame {

    //Boolean isVisible = true;
    Connection con;
    int CID;

    public Customer_ShoppingCart() {
        initComponents();
        con = db_connection.getConnection();
        PopulateTable();
    }

    public Customer_ShoppingCart(int ID) {
        CID = ID;
        initComponents();
        con = db_connection.getConnection();
        PopulateTable();
    }

    public void PopulateTable() {
        int Total_v = 0;
        String name = "";
        int id = 0;
        int SP = 0;
        int quant = 0;
        int LT = 0; // Line Total
        try {
            String Str_Query = "Select ITEM_ID, QUANTITY from SHOPPING_CART";
            PreparedStatement ps = con.prepareStatement(Str_Query);

            ResultSet resultSet = ps.executeQuery();
            int i = 0;

            while (resultSet.next()) {
                id = resultSet.getInt("ITEM_ID");
                quant = resultSet.getInt("QUANTITY");

                String Str_Query2 = "Select ITEM_NAME, SELLING_PRICE from ITEM_DETAIL where ITEM_ID= ? ";
                PreparedStatement ps2 = con.prepareStatement(Str_Query2);
                ps2.setInt(1, id);
                ResultSet resultSet2 = ps2.executeQuery();

                if (resultSet2.next()) {
                    name = resultSet2.getString("ITEM_NAME");
                    SP = resultSet2.getInt("SELLING_PRICE");
                }
                LT = SP * quant; // Generating Line Total
                Total_v = Total_v +LT;
                
                Object row[] = {id, name, SP, quant, LT};

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.insertRow(i, row);
                i++;
            }
            jTable1.getTableHeader().setFont(new Font("Nirmula UI", Font.BOLD, 14));
            jTable1.setShowVerticalLines(true);
            jTable1.setShowHorizontalLines(true);
            jTable1.setRowHeight(50);
            Total.setText(Total_v + "");
            Total.setEditable(false);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        admin7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Total = new javax.swing.JTextField();
        proceedToCheckout1 = new javax.swing.JButton();

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

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart(80).png"))); // NOI18N
        jLabel2.setText("SHOPPING CART");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 130, 90));

        admin7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin7.setText("Total");
        admin7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Price", "Quantity", "Line Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BackgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 980, 280));

        Total.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 210, 30));

        proceedToCheckout1.setBackground(new java.awt.Color(0, 102, 153));
        proceedToCheckout1.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        proceedToCheckout1.setForeground(new java.awt.Color(255, 255, 255));
        proceedToCheckout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/card(30).png"))); // NOI18N
        proceedToCheckout1.setText("PROCEED TO PAYMENT");
        proceedToCheckout1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        proceedToCheckout1.setContentAreaFilled(false);
        proceedToCheckout1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        proceedToCheckout1.setOpaque(true);
        proceedToCheckout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedToCheckout1ActionPerformed(evt);
            }
        });
        BackgroundPanel.add(proceedToCheckout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 430, 50));

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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Customer_Main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed


    private void proceedToCheckout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedToCheckout1ActionPerformed



        JFrame newMain = new Customer_Checkout();
        newMain.setVisible(true);
        newMain.setResizable(false);
        
        
        
        
    }//GEN-LAST:event_proceedToCheckout1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();

        int n = (int) model.getValueAt(index, 0);
        CID = 1;
        int Quantity_var = (int) model.getValueAt(index, 3);
        JFrame newMain = new ShoppingCart_PopUp(n, CID,Quantity_var);
        newMain.setVisible(true);
        newMain.setResizable(false);

    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Customer_ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</e
        JFrame newMain = new Customer_ShoppingCart();
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel admin7;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton proceedToCheckout1;
    // End of variables declaration//GEN-END:variables
}
