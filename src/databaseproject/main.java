/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Taha Waseem
 */
public class main extends JFrame {
    
  public main() {
    ImageIcon aboutIcon = new ImageIcon("C:\\Users\\Taha Waseem\\Downloads\\DatabaseProject\\DatabaseProject\\src\\icons\\ACCOUNT.png");

    String[] columnNames = { "Picture", "Description" };
    
    Object[][] data = { { aboutIcon, "About" }};

    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    JTable table = new JTable(model) {
      public Class getColumnClass(int column) {
        return (column == 0) ? Icon.class : Object.class;
      }
    };
    table.setPreferredScrollableViewportSize(table.getPreferredSize());
    table.setRowHeight(100);
    
    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane);
  }

  public static void main(String[] args) {
    main frame = new main();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

}
