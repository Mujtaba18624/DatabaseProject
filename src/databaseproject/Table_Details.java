/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

/**
 *
 * @author Taha Waseem
 */
public class Table_Details {
    String Name;    
    String Brand;
    int ITEMID;
    int CT;
    int price;
    byte[] bs;
    
    public Table_Details(){
    }
    public Table_Details(int Id, String Name, int Price, byte[] image, int CatId){
    
        ITEMID = Id;
        this.Name = Name;
        this.price = Price;
        bs = image;
        CT = CatId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getITEMID() {
        return ITEMID;
    }

    public void setITEMID(int ITEMID) {
        this.ITEMID = ITEMID;
    }

    public int getCT() {
        return CT;
    }

    public void setCT(int CT) {
        this.CT = CT;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public byte[] getBs() {
        return bs;
    }

    public void setBs(byte[] bs) {
        this.bs = bs;
    }
    
}
