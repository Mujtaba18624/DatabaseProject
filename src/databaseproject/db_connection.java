/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taha Waseem
 */
public class db_connection {

    public static Connection getConnection() {

        Connection myConn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "");
            System.out.println("Connection succesfull");
            return myConn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db_connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(db_connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return myConn;

    }

}
