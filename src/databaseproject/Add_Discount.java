package databaseproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class Add_Discount extends javax.swing.JFrame {

    //Boolean isVisible = true;
    
    
    public Add_Discount() {
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
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admin2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        admin5 = new javax.swing.JLabel();
        admin7 = new javax.swing.JLabel();
        DiscountPercentage = new javax.swing.JTextField();
        discountName = new javax.swing.JTextField();
        back = new javax.swing.JButton();

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

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin(80).png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, -1, -1));

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
        admin2.setText("ADMIN");
        admin2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_Discount(70).png"))); // NOI18N
        jLabel2.setText("ADD DISCOUNT");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        add.setBackground(new java.awt.Color(0, 102, 153));
        add.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add(50).png"))); // NOI18N
        add.setText("ADD ");
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        add.setContentAreaFilled(false);
        add.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add.setOpaque(true);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        BackgroundPanel.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 190, 60));

        admin5.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin5.setText("ENTER DISCOUNT PERCENTAGE:");
        admin5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        admin7.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin7.setText("ENTER DISCOUNT NAME");
        admin7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        DiscountPercentage.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        DiscountPercentage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DiscountPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountPercentageActionPerformed(evt);
            }
        });
        BackgroundPanel.add(DiscountPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 210, 40));

        discountName.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        discountName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        discountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountNameActionPerformed(evt);
            }
        });
        BackgroundPanel.add(discountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 420, 40));

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
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void DiscountPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountPercentageActionPerformed

    private void discountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountNameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Ad_Discount_Interface().setVisible(true);
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
            java.util.logging.Logger.getLogger(Apply_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apply_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apply_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apply_Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
        JFrame newMain = new Add_Discount();
        newMain.setTitle("STAM Virtual Mart");
        newMain.setVisible(true);
        newMain.setResizable(false);
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JTextField DiscountPercentage;
    private javax.swing.JButton add;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel admin5;
    private javax.swing.JLabel admin7;
    private javax.swing.JButton back;
    private javax.swing.JTextField discountName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}