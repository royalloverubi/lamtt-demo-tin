package com.nhannt.snef.model;

import java.io.Serializable;

public class ProductFlashSales implements Serializable {

    private int productflashsalesid;

    private int discount;

    private String startdate;

    private String enddate;

    private int quantity;

    private int productitemid;

    private int accountid;

    private float price;

    private String itemName;

    private String image;

    public ProductFlashSales() {
    }

    public ProductFlashSales
            (int productflashsalesid,int discount, String startdate, String enddate, int quantity, int productitemid, int accountid, float price, String itemName, String image) {
        this.productflashsalesid = productflashsalesid;
        this.discount = discount;
        this.startdate = startdate;
        this.enddate = enddate;
        this.quantity = quantity;
        this.productitemid = productitemid;
        this.accountid = accountid;
        this.price = price;
        this.itemName = itemName;
        this.image = image;
    }

    public int getProductflashsalesid() {
        return productflashsalesid;
    }

    public void setProductflashsalesid(int productflashsalesid) {
        this.productflashsalesid = productflashsalesid;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductitemid() {
        return productitemid;
    }

    public void setProductitemid(int productitemid) {
        this.productitemid = productitemid;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
