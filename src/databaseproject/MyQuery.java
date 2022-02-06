    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

//import com.healthmarketscience.jackcess.query.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taha Waseem
 */
public class MyQuery {

    public ArrayList<Table_Details> BindTable() {

        ArrayList<Table_Details> list = new ArrayList<Table_Details>();
        Connection con = db_connection.getConnection();
        Statement st;

        try {
            st = con.createStatement();            
            String Str_Query = "Select ITEM_ID, Category_Type_ID, ITEM_NAME, SELLING_PRICE, ITEM_IMAGE from ITEM_DETAIL"
                    + " where APPROVAL_STATUS =?";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, "APPROVED");

            ResultSet rs = ps.executeQuery();
            Table_Details p;
            String str;

            while (rs.next()) {
                p = new Table_Details(
                        rs.getInt("ITEM_ID"),
                        rs.getString("ITEM_NAME"),
                        rs.getInt("SELLING_PRICE"),
                        rs.getBytes("ITEM_IMAGE"),
                        rs.getInt("Category_Type_ID")
                );
                str = "Select SUB_CATEGORY_NAME from SUB_CATEGORY JOIN SUB_CATEGORY_TYPE USING (SUB_CATEGORY_ID)"
                        + " where CATEGORY_TYPE_ID =?";
                PreparedStatement ps_v = con.prepareStatement(str);
                ps_v.setInt(1, p.CT);
                ResultSet rs_v = ps_v.executeQuery();

                if (rs_v.next()) {
                    p.Brand = rs_v.getString("SUB_CATEGORY_NAME");
                }
                list.add(p);
            }
//int Id, String Name, String brand, int Price, byte[] image, int CatId
        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public ArrayList<Table_Details> BindTableCategory(String type) {

        ArrayList<Table_Details> list = new ArrayList<Table_Details>();
        Connection con = db_connection.getConnection();
        Statement st;

        try {
            st = con.createStatement();            
           
            String Str_Query = "Select ITEM_ID, Category_Type_ID, ITEM_NAME, SELLING_PRICE, ITEM_IMAGE from "
                    + "ITEM_DETAIL where APPROVAL_STATUS = 'APPROVED' AND CATEGORY_TYPE_ID IN "
                    + "(SELECT CATEGORY_TYPE_ID from SUB_CATEGORY_TYPE where SUB_CATEGORY_ID IN "
                    + "(SELECT SUB_CATEGORY_ID from SUB_CATEGORY where CATEGORY_ID IN (SELECT CATEGORY_ID "
                    + "from CATEGORY where CATEGORY_NAME=?)));";
            PreparedStatement ps = con.prepareStatement(Str_Query);
            ps.setString(1, type);
            ResultSet rs = ps.executeQuery();
            Table_Details p;
            String str;

            while (rs.next()) {
                p = new Table_Details(
                        rs.getInt("ITEM_ID"),
                        rs.getString("ITEM_NAME"),
                        rs.getInt("SELLING_PRICE"),
                        rs.getBytes("ITEM_IMAGE"),
                        rs.getInt("Category_Type_ID")
                );
                str = "Select SUB_CATEGORY_NAME from SUB_CATEGORY JOIN SUB_CATEGORY_TYPE USING (SUB_CATEGORY_ID)"
                        + " where CATEGORY_TYPE_ID =?";
                PreparedStatement ps_v = con.prepareStatement(str);
                ps_v.setInt(1, p.CT);
                ResultSet rs_v = ps_v.executeQuery();

                if (rs_v.next()) {
                    p.Brand = rs_v.getString("SUB_CATEGORY_NAME");
                }
                list.add(p);
            }
//int Id, String Name, String brand, int Price, byte[] image, int CatId
        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    
    
}
