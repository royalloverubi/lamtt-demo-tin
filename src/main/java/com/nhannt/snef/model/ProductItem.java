package com.nhannt.snef.model;


import java.io.Serializable;

public class ProductItem implements Serializable {

    private int productitemid;

    private int quantity;

    private float price;

    private String productitemname;

    private String expireddate;

    private int accountid;

    private int productid;

    private String productimage;

    public ProductItem() {
    }

    public ProductItem(int productitemid, int quantity, float price, String productitemname, String expireddate, int accountid, int productid, String productimage) {

        this.productitemid = productitemid;
        this.quantity = quantity;
        this.price = price;
        this.productitemname = productitemname;
        this.expireddate = expireddate;
        this.accountid = accountid;
        this.productid = productid;
        this.productimage = productimage;
    }

    public int getProductitemid() {
        return productitemid;
    }

    public void setProductitemid(int productitemid) {
        this.productitemid = productitemid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductitemname() {
        return productitemname;
    }

    public void setProductitemname(String productitemname) {
        this.productitemname = productitemname;
    }

    public String getExpireddate() {
        return expireddate;
    }

    public void setExpireddate(String expireddate) {
        this.expireddate = expireddate;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }
}
