/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import static com.oracle.jrockit.jfr.ContentType.Bytes;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Customer_PopUp1 extends javax.swing.JFrame {

    Connection con;
    int ID;
    int CID;

    JFrame f = new JFrame();

    //Boolean isVisible = true;
    public Customer_PopUp1() {
        initComponents();
        con = db_connection.getConnection();
        DisplayYo();
        setEditable();
    }

    public Customer_PopUp1(int ID, int CID) {
        initComponents();
        this.ID = ID;
        this.CID = CID;
        con = db_connection.getConnection();
        DisplayYo();
        setEditable();
        
    }

    public void setEditable() {

        name.setEditable(false);
        description.setEditable(false);
        price1.setEditable(false);
        model1.setEditable(false);
        aqty.setEditable(false);
        
        
        SpinnerModel model = new SpinnerNumberModel(1, 1, 50, 1);
        quantity.setModel(model);

    }

    public void DisplayYo() {

        Statement st;
        String v_name = "";
        String v_desc = "";
        String brd = "";
        String str = "";

        int v_price = 0;
        int CTypeID = 0;
        int CI = 0;

        byte[] img = null;

        try {
            st = con.createStatement();
            String Str_Query = "Select ITEM_NAME, CATEGORY_TYPE_ID, DESCRIPTION, SELLING_PRICE, ITEM_IMAGE, CURRENT_INVENTORY from ITEM_DETAIL"
                    + " where ITEM_ID=?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                v_name = rs.getString("ITEM_NAME");
                v_desc = rs.getString("DESCRIPTION");
                v_price = rs.getInt("SELLING_PRICE");
                img = rs.getBytes("ITEM_IMAGE");
                CTypeID = rs.getInt("CATEGORY_TYPE_ID");
                CI = rs.getInt("CURRENT_INVENTORY");

                str = "Select CATEGORY_TYPE_NAME from SUB_CATEGORY_TYPE"
                        + " where CATEGORY_TYPE_ID =?";
                PreparedStatement ps_v = con.prepareStatement(str);
                ps_v.setInt(1, CTypeID);
                ResultSet rs_v = ps_v.executeQuery();
                if (rs_v.next()) {
                    brd = rs_v.getString("CATEGORY_TYPE_NAME");
                }
            }
            //int Id, String Name, String brand, int Price, byte[] image, int CatId
        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon image = new ImageIcon(new ImageIcon(img).getImage()
                .getScaledInstance(200, 200, Image.SCALE_SMOOTH));

        selectedPhoto.setIcon(image);
        name.setText(v_name);
        description.setText(v_desc);
        model1.setText(brd);
        price1.setText(String.valueOf(v_price));
        aqty.setText(String.valueOf(CI));

    }

    @SuppressWarnings("unchecked")
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
        admin8 = new javax.swing.JLabel();
        admin9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        admin10 = new javax.swing.JLabel();
        quantity = new javax.swing.JSpinner();
        AddToCart = new javax.swing.JButton();
        selectedPhoto = new javax.swing.JLabel();
        aqty = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        admin12 = new javax.swing.JLabel();
        model1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();

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
        jLabel1.setText("PRODUCT DETAIL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 60));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));

        admin6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin6.setText("Available Quantity");
        admin6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        admin7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin7.setText("Product Name");
        admin7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        admin8.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin8.setText("Quantity");
        admin8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        admin9.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin9.setText("Description");
        admin9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        name.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 280, 50));

        admin10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin10.setText("Price");
        admin10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        quantity.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        BackgroundPanel.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 80, 30));

        AddToCart.setBackground(new java.awt.Color(0, 102, 153));
        AddToCart.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        AddToCart.setForeground(new java.awt.Color(255, 255, 255));
        AddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart(30).png"))); // NOI18N
        AddToCart.setText("ADD TO CART");
        AddToCart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AddToCart.setContentAreaFilled(false);
        AddToCart.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AddToCart.setOpaque(true);
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });
        BackgroundPanel.add(AddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 270, -1));

        selectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 64), 1, true));
        selectedPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackgroundPanel.add(selectedPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 270, 210));

        aqty.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        aqty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(aqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 60, 30));

        price1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        price1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 190, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 520, 130, 90));

        admin12.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        admin12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin12.setText("Model");
        admin12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        model1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        model1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(model1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 250, 30));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        description.setLineWrap(true);
        description.setRows(5);
        description.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(description);

        BackgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 310, 190));

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

    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed

        int i = 0;
        try {
            String Str_Query = "Select * from SHOPPING_CART where ITEM_ID=?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setInt(1, ID);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                i = 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Ad_ActiveSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
        int getQuantity = Integer.parseInt(quantity.getValue().toString());

        if (getQuantity > Integer.parseInt(aqty.getText())) {
            JOptionPane.showMessageDialog(f, "Ordered quantity should be less than available quantity", "ERROR", JOptionPane.ERROR_MESSAGE);
            JFrame newMain = new Customer_PopUp1(ID, CID);
            newMain.setVisible(true);
            newMain.setResizable(false);

        } else if (i == 1) {

            JOptionPane.showMessageDialog(f, "Item is already added to Cart. Please view Cart", "ERROR", JOptionPane.ERROR_MESSAGE);
            JFrame newMain = new Customer_Main();
            newMain.setVisible(true);
            newMain.setResizable(false);
        } else {

            try {

                String Str_Query = "INSERT INTO SHOPPING_CART (ITEM_ID, QUANTITY)"
                        + " VALUES (?,?)";
                PreparedStatement ps = con.prepareStatement(Str_Query);
                ps.setInt(1, ID);
                ps.setInt(2, getQuantity);

                int resultSetInt = ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(Customer_PopUp1.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFrame newMain = new Customer_Main();
            newMain.setVisible(true);
            newMain.setResizable(false);

            JOptionPane.showMessageDialog(null, "Item Succussfully Added to CART", "Message", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_AddToCartActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        JFrame newMain = new Customer_Main(CID);
        newMain.setVisible(true);
        newMain.setResizable(false);

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
            java.util.logging.Logger.getLogger(Customer_PopUp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_PopUp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_PopUp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_PopUp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
        JFrame newMain = new Customer_PopUp1();
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel admin10;
    private javax.swing.JLabel admin12;
    private javax.swing.JLabel admin6;
    private javax.swing.JLabel admin7;
    private javax.swing.JLabel admin8;
    private javax.swing.JLabel admin9;
    private javax.swing.JTextField aqty;
    private javax.swing.JButton back;
    private javax.swing.JTextArea description;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private javax.swing.JTextField model1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price1;
    private javax.swing.JSpinner quantity;
    private javax.swing.JLabel selectedPhoto;
    // End of variables declaration//GEN-END:variables
}
