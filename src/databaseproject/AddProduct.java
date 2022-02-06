/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.*;
import java.util.logging.Level;

/**
 *
 * @author Void
 */
public class AddProduct extends javax.swing.JFrame {

    //Boolean isVisible = true;
    public AddProduct() {
        initComponents();

    }
    JFrame f = new JFrame();
    String Path = "";

    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        mPhotoPath = new javax.swing.JTextField();
        photoSelection = new javax.swing.JButton();
        selectedPhoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        upload = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAM VIRTUAL MART");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_seller/seller(80).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delivering Low-Cost and High-Quality Goods Right at Your Doorstep");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        jLabel5.setText("SELLER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25))
        );

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Product Details");
        BackgroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 370, -1));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        description.setLineWrap(true);
        description.setRows(5);
        description.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(description);

        BackgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 460, 190));

        mPhotoPath.setEditable(false);
        mPhotoPath.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        mPhotoPath.setText("Choose photo:");
        mPhotoPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mPhotoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPhotoPathActionPerformed(evt);
            }
        });
        BackgroundPanel.add(mPhotoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 190, 30));

        photoSelection.setBackground(new java.awt.Color(0, 77, 64));
        photoSelection.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        photoSelection.setForeground(new java.awt.Color(255, 255, 255));
        photoSelection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_seller/icons8_Add_Camera_20px.png"))); // NOI18N
        photoSelection.setBorder(null);
        photoSelection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        photoSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoSelectionActionPerformed(evt);
            }
        });
        BackgroundPanel.add(photoSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 470, 50, 30));

        selectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_seller/icons8_Add_Image_100px.png"))); // NOI18N
        selectedPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 64), 1, true));
        selectedPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackgroundPanel.add(selectedPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 230, 210));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel9.setText("Quantity");
        BackgroundPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 30));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel10.setText("Product Description");
        BackgroundPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 180, 30));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel11.setText("Name");
        BackgroundPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 140, -1));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel12.setText("Cost Price");
        BackgroundPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 140, 30));

        name.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        BackgroundPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 238, 450, 30));

        price.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        BackgroundPanel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 288, 170, 30));

        quantity.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackgroundPanel.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 170, 30));

        upload.setBackground(new java.awt.Color(0, 102, 153));
        upload.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        upload.setForeground(new java.awt.Color(255, 255, 255));
        upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_seller/upload_1.png"))); // NOI18N
        upload.setText("UPLOAD");
        upload.setActionCommand("");
        upload.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        upload.setContentAreaFilled(false);
        upload.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        upload.setOpaque(true);
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        BackgroundPanel.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 200, 70));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 130, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mPhotoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPhotoPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhotoPathActionPerformed

    private void photoSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoSelectionActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File selectedImage = fc.getSelectedFile();
        Path = selectedImage.getName();

        try {
            Image img = ImageIO.read(selectedImage);
            mPhotoPath.setText(Path);
            selectedPhoto.setIcon(new ImageIcon(img.getScaledInstance(selectedPhoto.getWidth(),
                    selectedPhoto.getHeight(), Image.SCALE_SMOOTH)));
        } catch (IOException ex) {

        }

    }//GEN-LAST:event_photoSelectionActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        if (name.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Value, Enter Product Name", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (price.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Value, Enter Product Price", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(price.getText())) {
            JOptionPane.showMessageDialog(f, "Invalid Value, Enter Numeric Price Value", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (quantity.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Value, Enter Product Quantity", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(quantity.getText())) {
            JOptionPane.showMessageDialog(f, "Invalid Value, Enter Numeric Quantity Value", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (description.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Value, Enter Product Description", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (Path.equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Image, Upload Product Image", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {
            
            // Store product in database code
            JOptionPane.showMessageDialog(f,"Product Uploaded Successfully" );
            this.setVisible(false);
            HomeSeller abc = new HomeSeller();
            abc.setVisible(true);
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HomeSeller abc = new HomeSeller();
        abc.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
        JFrame newMain = new AddProduct();
        newMain.setTitle("STAM Virtual Mart");
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton back;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mPhotoPath;
    private javax.swing.JTextField name;
    private javax.swing.JButton photoSelection;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel selectedPhoto;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
