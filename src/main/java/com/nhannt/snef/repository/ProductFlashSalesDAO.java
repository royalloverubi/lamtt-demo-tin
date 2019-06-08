package com.nhannt.snef.repository;

import com.nhannt.snef.connection.MyConnection;
import com.nhannt.snef.model.ProductFlashSales;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductFlashSalesDAO implements Serializable {
    public List<ProductFlashSales> loadFsToDay() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ProductFlashSales> flashSales = null;
        try {
            con = MyConnection.myConnection();
            if (con !=null){
                String sql =
                        "SELECT fs.productflashsalesid, fs.discount, fs.startdate, fs.enddate, fs.quantity, fs.productitemid, fs.accountid, p.price, p.productitemname, p.productimage " +
                        "FROM ProductFlashSales fs, productitem p " +
                        "WHERE fs.productitemid = p.productitemid " +
                        "AND CONVERT(DATE , GETDATE()) >= fs.startdate AND CONVERT(DATE, fs.enddate) <= CONVERT(DATE, GETDATE())";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()){
                    int fsId = rs.getInt("productflashsalesid");
                    int discount = rs.getInt("discount");
                    String startdate = rs.getString("startdate");
                    String enddate = rs.getString("enddate");
                    int quantity = rs.getInt("quantity");
                    int productitemid = rs.getInt("productitemid");
                    int accountid = rs.getInt("accountid");
                    float price = rs.getFloat("price");
                    String itemName = rs.getString("productitemname");
                    String image = rs.getString("productimage");

                    ProductFlashSales dto = new ProductFlashSales(fsId, discount, startdate, enddate, quantity, productitemid, accountid, price, itemName, image);
                    if (flashSales == null){
                        flashSales = new ArrayList<>();
                    }
                    flashSales.add(dto);

                }
                return flashSales;
            }
        }finally {

            if (rs != null){
                rs.close();
            }
            if (stm !=null){
                stm.close();
            }
            if (con!=null){
                con.close();
            }
        }
        return null;
    }

    public List<ProductFlashSales> loadFsTomoroww() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ProductFlashSales> flashSales = null;
        try {
            con = MyConnection.myConnection();
            if (con !=null){
                String sql =
                        "SELECT fs.productflashsalesid, fs.discount, fs.startdate, fs.enddate, fs.quantity, fs.productitemid, fs.accountid, p.price, p.productitemname, p.productimage " +
                                "FROM ProductFlashSales fs, productitem p " +
                                "WHERE fs.productitemid = p.productitemid " +
                                "AND CONVERT(DATE , GETDATE() + 1) >= fs.startdate AND CONVERT(DATE, fs.enddate) <= CONVERT(DATE, GETDATE() + 1)";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()){
                    int fsId = rs.getInt("productflashsalesid");
                    int discount = rs.getInt("discount");
                    String startdate = rs.getString("startdate");
                    String enddate = rs.getString("enddate");
                    int quantity = rs.getInt("quantity");
                    int productitemid = rs.getInt("productitemid");
                    int accountid = rs.getInt("accountid");
                    float price = rs.getFloat("price");
                    String itemName = rs.getString("productitemname");
                    String image = rs.getString("productimage");

                    ProductFlashSales dto = new ProductFlashSales(fsId, discount, startdate, enddate, quantity, productitemid, accountid, price, itemName, image);
                    if (flashSales == null){
                        flashSales = new ArrayList<>();
                    }
                    flashSales.add(dto);

                }
                return flashSales;
            }
        }finally {

            if (rs != null){
                rs.close();
            }
            if (stm !=null){
                stm.close();
            }
            if (con!=null){
                con.close();
            }
        }
        return null;
    }

    public List<ProductFlashSales> loadFsNext() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ProductFlashSales> flashSales = null;
        try {
            con = MyConnection.myConnection();
            if (con !=null){
                String sql =
                        "SELECT fs.productflashsalesid, fs.discount, fs.startdate, fs.enddate, fs.quantity, fs.productitemid, fs.accountid, p.price, p.productitemname, p.productimage " +
                                "FROM ProductFlashSales fs, productitem p " +
                                "WHERE fs.productitemid = p.productitemid " +
                                "AND CONVERT(DATE , GETDATE() + 2) >= fs.startdate AND CONVERT(DATE, fs.enddate) <= CONVERT(DATE, GETDATE() + 2)";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()){
                    int fsId = rs.getInt("productflashsalesid");
                    int discount = rs.getInt("discount");
                    String startdate = rs.getString("startdate");
                    String enddate = rs.getString("enddate");
                    int quantity = rs.getInt("quantity");
                    int productitemid = rs.getInt("productitemid");
                    int accountid = rs.getInt("accountid");
                    float price = rs.getFloat("price");
                    String itemName = rs.getString("productitemname");
                    String image = rs.getString("productimage");

                    ProductFlashSales dto = new ProductFlashSales(fsId, discount, startdate, enddate, quantity, productitemid, accountid, price, itemName, image);
                    if (flashSales == null){
                        flashSales = new ArrayList<>();
                    }
                    flashSales.add(dto);

                }
                return flashSales;
            }
        }finally {

            if (rs != null){
                rs.close();
            }
            if (stm !=null){
                stm.close();
            }
            if (con!=null){
                con.close();
            }
        }
        return null;
    }
}
