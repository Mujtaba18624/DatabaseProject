/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Font;
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

/**
 *
 * @author Void
 */
public class Customer_Checkout extends javax.swing.JFrame {

    Connection con;
    int CID = 1;
    int Total_v = 0;
    String BN = "";
    String CT = "";
    int tax_value = 0;
    int FT = 0;

    public Customer_Checkout() {
        initComponents();
        con = db_connection.getConnection();

        PopulateTable();
        Initialize_Data();
        Set_Labels();

    }

    public void Set_Labels() {
        Total.setText(Total_v + "");

        Double temp = Total_v * 0.13;
        tax_value = temp.intValue();
        Tax.setText(tax_value + "");

        Double temp0 = Total_v * 1.13;
        FT = temp0.intValue();
        FinalTotal.setText(FT + "");
    }

    public void Initialize_Data() {
        try {
            String Str_Query = "Select ADDRESS, POSTAL_CODE, CITY, COUNTRY FROM CUSTOMER_ADDRESS where CUSTOMER_ID=?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setInt(1, CID);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String adr = resultSet.getString("ADDRESS");
                String pc = resultSet.getString("POSTAL_CODE");
                String city_v = resultSet.getString("CITY");
                String country_v = resultSet.getString("COUNTRY");
                Deliver.addItem(adr + ", " + pc + ", " + city_v + ", " + country_v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String Str_Query = "Select DISTINCT BANK_NAME FROM CARD where CARD_ID IN "
                    + "(Select CARD_ID from CUSTOMER_PAYMENT where CUSTOMER_ID=?)";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setInt(1, CID);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                BN = resultSet.getString("BANK_NAME");
                Bank.addItem(BN);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String Str_Query = "Select CARD_TYPE FROM CARD where BANK_NAME=? AND CARD_ID IN "
                    + "(Select CARD_ID from CUSTOMER_PAYMENT where CUSTOMER_ID=?)";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, Bank.getSelectedItem().toString());
            ps.setInt(2, CID);

            Type.removeAllItems();
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                CT = resultSet.getString("CARD_TYPE");
                Type.addItem(CT);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void PopulateTable() {

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
                Total_v = Total_v + LT;

                Object row[] = {id, name, SP, quant, LT};
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.insertRow(i, row);
                i++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTable1.getTableHeader().setFont(new Font("Nirmula UI", Font.BOLD, 14));
        jTable1.setShowVerticalLines(true);
        jTable1.setShowHorizontalLines(true);
        jTable1.setRowHeight(25);

        jTable1.getColumnModel().getColumn(0).setMaxWidth(30);

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
        back = new javax.swing.JButton();
        admin7 = new javax.swing.JLabel();
        admin8 = new javax.swing.JLabel();
        Type = new javax.swing.JComboBox<String>();
        ConfirmOrder = new javax.swing.JButton();
        AddAddress = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Total = new javax.swing.JTextField();
        AddAddress1 = new javax.swing.JButton();
        Deliver = new javax.swing.JComboBox<String>();
        admin9 = new javax.swing.JLabel();
        admin10 = new javax.swing.JLabel();
        Bank = new javax.swing.JComboBox<String>();
        admin11 = new javax.swing.JLabel();
        FinalTotal = new javax.swing.JTextField();
        admin12 = new javax.swing.JLabel();
        Tax = new javax.swing.JTextField();

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
        admin7.setText("Select Type");
        admin7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        admin8.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin8.setText("Total (without Tax)");
        admin8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, -1, -1));

        Type.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Type.setBorder(null);
        Type.setFocusable(false);
        Type.setOpaque(false);
        Type.setBackground(Color.WHITE);
        BackgroundPanel.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 150, 40));

        ConfirmOrder.setBackground(new java.awt.Color(0, 102, 153));
        ConfirmOrder.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        ConfirmOrder.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/checkout(30).png"))); // NOI18N
        ConfirmOrder.setText("CONFIRM ORDER");
        ConfirmOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ConfirmOrder.setContentAreaFilled(false);
        ConfirmOrder.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ConfirmOrder.setOpaque(true);
        ConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOrderActionPerformed(evt);
            }
        });
        BackgroundPanel.add(ConfirmOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 310, 50));

        AddAddress.setBackground(new java.awt.Color(0, 102, 153));
        AddAddress.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        AddAddress.setForeground(new java.awt.Color(255, 255, 255));
        AddAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/address(30).png"))); // NOI18N
        AddAddress.setText("ADD ADDRESS");
        AddAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AddAddress.setContentAreaFilled(false);
        AddAddress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AddAddress.setOpaque(true);
        AddAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAddressActionPerformed(evt);
            }
        });
        BackgroundPanel.add(AddAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 260, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Price", "Quantity", "Line Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BackgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 1020, 150));

        Total.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 180, 30));

        AddAddress1.setBackground(new java.awt.Color(0, 102, 153));
        AddAddress1.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        AddAddress1.setForeground(new java.awt.Color(255, 255, 255));
        AddAddress1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/card(30).png"))); // NOI18N
        AddAddress1.setText("ADD CARD");
        AddAddress1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AddAddress1.setContentAreaFilled(false);
        AddAddress1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AddAddress1.setOpaque(true);
        AddAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAddress1ActionPerformed(evt);
            }
        });
        BackgroundPanel.add(AddAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 260, -1));

        Deliver.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Deliver.setBorder(null);
        Deliver.setFocusable(false);
        Deliver.setOpaque(false);
        Type.setBackground(Color.WHITE);
        BackgroundPanel.add(Deliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 730, 40));

        admin9.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin9.setText("Deliver To");
        admin9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        admin10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin10.setText("Select Bank");
        admin10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        Bank.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Bank.setBorder(null);
        Bank.setFocusable(false);
        Bank.setOpaque(false);
        Type.setBackground(Color.WHITE);
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
        BackgroundPanel.add(Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 150, 40));

        admin11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin11.setText("Tax (13%)");
        admin11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, -1, -1));

        FinalTotal.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        FinalTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(FinalTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 180, -1));

        admin12.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin12.setText("Total");
        admin12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, -1, -1));

        Tax.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Tax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(Tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 120, 30));

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

    public void Traverse_Table() {

    }

    private void ConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOrderActionPerformed

        int Payment_ID = 0;
        try {
            String Str_Query = "Select PAYMENT_ID FROM CUSTOMER_PAYMENT where CARD_ID = "
                    + "(Select CARD_ID from CARD where BANK_NAME=? AND CARD_TYPE=?)";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, Bank.getSelectedItem().toString());
            ps.setString(2, Type.getSelectedItem().toString());
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                Payment_ID = resultSet.getInt("PAYMENT_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String Str_Query = "INSERT INTO ORDER_TRANSACTION (CUSTOMER_ID, ORDER_DATE, TOTAL_COST, PAYMENT_ID, TAX_PERCENT, COST_TAX_EXCLUSIVE)"
                    + " VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(Str_Query);
            long m = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(m);
            ps.setInt(1, CID);
            ps.setDate(2, date);
            ps.setInt(3, FT);
            ps.setInt(4, Payment_ID);
            ps.setInt(5, 13);
            ps.setInt(6, Total_v);

            int resultSetInt = ps.executeUpdate();

//            CID = 0;
//            while (resultSet.next()) {
//            CID = resultSet.getInt("CUSTOMER_ID");
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Order_ID = "";
        try {
            String Str_Query = "Select LAST_INSERT_ID();";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Order_ID = resultSet.getString("LAST_INSERT_ID()");
                //System.out.println(Order_ID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }

        int Item_ID = 0;
        int SELLER_ID = 0;
        int Quantity_v = 0;
        int LT = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {  // Loop through the rows

            Item_ID = (int) jTable1.getValueAt(i, 0);
            Quantity_v = (int) jTable1.getValueAt(i, 3);
            LT = (int) jTable1.getValueAt(i, 4);

            try {
                String Str_Query = "INSERT INTO ITEM_TRANSACTION (ORDER_ID, ITEM_ID, QUANTITY, LINE_TOTAL)"
                        + " VALUES (?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(Str_Query);
                ps.setString(1, Order_ID);
                ps.setInt(2, Item_ID);
                ps.setInt(3, Quantity_v);
                ps.setInt(4, LT);

                int resultSetInt = ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                String Str_Query = "Select SELLER_ID FROM ITEM_DETAIL where ITEM_ID=?";
                PreparedStatement ps = con.prepareStatement(Str_Query);
                ps.setInt(1, Item_ID);
                ResultSet resultSet = ps.executeQuery();

                if (resultSet.next()) {
                    SELLER_ID = resultSet.getInt("SELLER_ID");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Start
            int Balance = 0;
            int TE = 0;
            try {
                String Str_Query = "Select TOTAL_EARNED, BALANCE FROM SELLER where SELLER_ID=?";
                PreparedStatement ps = con.prepareStatement(Str_Query);
                ps.setInt(1, SELLER_ID);
                ResultSet resultSet = ps.executeQuery();

                if (resultSet.next()) {
                    TE = resultSet.getInt("TOTAL_EARNED");
                    Balance = resultSet.getInt("BALANCE");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
            }
            //End
            try {
                String Str_Query = "UPDATE SELLER SET TOTAL_EARNED=?, BALANCE=? where SELLER_ID =?";
                PreparedStatement ps = con.prepareStatement(Str_Query);;
                ps.setInt(1, Total_v + TE);
                ps.setInt(2, Total_v + Balance);
                ps.setInt(3, SELLER_ID);

                ps.execute();
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                String Str_Query = "UPDATE ITEM_DETAIL SET CURRENT_INVENTORY = CURRENT_INVENTORY - ? where ITEM_ID =?";
                PreparedStatement ps;
                ps = con.prepareStatement(Str_Query);
                ps.setInt(1, Quantity_v);
                ps.setInt(2, Item_ID);
                ps.execute();
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Order placed succesfully", "Message", JOptionPane.INFORMATION_MESSAGE);
        new Customer_Main().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ConfirmOrderActionPerformed

    private void AddAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAddressActionPerformed
        // TODO add your handling code here:

        JFrame newMain = new Customer_AddAddress();
        newMain.setVisible(true);
        newMain.setResizable(false);
    }//GEN-LAST:event_AddAddressActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Customer_ShoppingCart().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void AddAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAddress1ActionPerformed

        JFrame newMain = new New_Card();
        newMain.setVisible(true);
        newMain.setResizable(false);
    }//GEN-LAST:event_AddAddress1ActionPerformed

    private void BankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankMouseClicked

        try {
            String Str_Query = "Select CARD_TYPE FROM CARD where BANK_NAME=? AND CARD_ID IN "
                    + "(Select CARD_ID from CUSTOMER_PAYMENT where CUSTOMER_ID=?)";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, Bank.getSelectedItem().toString());
            ps.setInt(2, CID);

            Type.removeAllItems();
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                CT = resultSet.getString("CARD_TYPE");
                Type.addItem(CT);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BankMouseClicked

    private void BankPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BankPropertyChange

    }//GEN-LAST:event_BankPropertyChange

    private void BankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankActionPerformed
        try {
            String Str_Query = "Select CARD_TYPE FROM CARD where BANK_NAME=? AND CARD_ID IN "
                    + "(Select CARD_ID from CUSTOMER_PAYMENT where CUSTOMER_ID=?)";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, Bank.getSelectedItem().toString());
            ps.setInt(2, CID);

            Type.removeAllItems();
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                CT = resultSet.getString("CARD_TYPE");
                Type.addItem(CT);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BankActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</edito
        //</editor-fold>

        JFrame newMain = new Customer_Checkout();
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAddress;
    private javax.swing.JButton AddAddress1;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JComboBox<String> Bank;
    private javax.swing.JButton ConfirmOrder;
    private javax.swing.JComboBox<String> Deliver;
    private javax.swing.JTextField FinalTotal;
    private javax.swing.JTextField Tax;
    private javax.swing.JTextField Total;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JLabel admin10;
    private javax.swing.JLabel admin11;
    private javax.swing.JLabel admin12;
    private javax.swing.JLabel admin7;
    private javax.swing.JLabel admin8;
    private javax.swing.JLabel admin9;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
