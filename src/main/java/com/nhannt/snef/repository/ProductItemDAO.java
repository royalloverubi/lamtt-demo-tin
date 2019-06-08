package com.nhannt.snef.repository;

import com.nhannt.snef.connection.MyConnection;
import com.nhannt.snef.model.ProductItem;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductItemDAO implements Serializable {
    public List<ProductItem> loadAllItem() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ProductItem> items = null;
        try {
            con = MyConnection.myConnection();
            if (con !=null){
                String sql =
                        "SELECT p.productitemid, p.quantity, p.price, p.productitemname, p.expireddate, p.accountid, p.productid, p.productimage " +
                        "FROM dbo.productitem p ";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()){
                    int proItemId = rs.getInt("productitemid");
                    int quantity = rs.getInt("quantity");
                    float price = rs.getFloat("price");
                    String proItemName = rs.getString("productitemname");
                    String expireddate = rs.getString("expireddate");
                    int accountid = rs.getInt("accountid");
                    int productid = rs.getInt("productid");
                    String image = rs.getString("productimage");

                    ProductItem dto = new ProductItem(proItemId, quantity, price, proItemName, expireddate, accountid, productid, image);
                    if (items == null){
                        items = new ArrayList<>();
                    }
                    items.add(dto);

                }
                return  items;
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

    public List<ProductItem> loadItemById(int proItemId) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ProductItem> proId = null;
        try {
            con = MyConnection.myConnection();
            if (con !=null){
                String sql = "SELECT p.productitemid, p.quantity, p.price, p.productitemname, p.expireddate, p.accountid, p.productid, p.productimage " +
                        "FROM productitem p " +
                        "WHERE p.productitemid = ? ";
                stm = con.prepareStatement(sql);
                stm.setInt(1, proItemId);
                rs = stm.executeQuery();
                while (rs.next()){
                    int productitemid = rs.getInt("productitemid");
                    int quantity = rs.getInt("quantity");
                    float price = rs.getFloat("price");
                    String proItemName = rs.getString("productitemname");
                    String expireddate = rs.getString("expireddate");
                    int accountid = rs.getInt("accountid");
                    int productid = rs.getInt("productid");
                    String productimage = rs.getString("productimage");
                    ProductItem dto = new ProductItem(productitemid, quantity, price, proItemName, expireddate, accountid, productid, productimage);
                    if (proId == null){
                        proId = new ArrayList<>();
                    }
                    proId.add(dto);
                }
                return  proId;
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
