package com.nhannt.snef.repository;

import com.nhannt.snef.connection.MyConnection;
import com.nhannt.snef.model.Product;
import org.springframework.stereotype.Repository;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDAO implements Serializable {

    /*
    * Load all Product using dbo.Product
    * */
    public List<Product> loadAllProduct() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Product> products = new ArrayList<>();
        try {
            con = MyConnection.myConnection();
            if (con !=null){
                String sql = "SELECT p.productid, p.productname,p.description,p.picture,p.categoriesid FROM product p";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()){
                    int pro = rs.getInt("productid");
                    String proName = rs.getString("productname");
                    String des = rs.getString("description");
                    String pic = rs.getString("picture");
                    int catId = rs.getInt("categoriesid");

                    Product dto = new Product(pro, proName, des, pic, catId);

                    products.add(dto);

                }
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
        return products;
    }

    /*
    * Search Product name using dbo.product
    * */

    public List<Product> searchProByName(String proName) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Product> searchValue = null;
        try {
            con = MyConnection.myConnection();
            if (con != null){
                String sql = "SELECT p.productid, p.productname, p.description, p.picture,p.categoriesid " +
                        "FROM Product p " +
                        "WHERE p.productname LIKE ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + proName + "%");
                rs = stm.executeQuery();
                while (rs.next()){
                    int proId = rs.getInt("productid");
                    String productname = rs.getString("productname");
                    String des = rs.getString("description");
                    String pic = rs.getString("picture");
                    int cate = rs.getInt("categoriesid");

                    Product dto = new Product(proId, productname, des, pic, cate);
                    if (searchValue == null){
                        searchValue = new ArrayList<>();
                    }
                    searchValue.add(dto);
                }
                return searchValue;
            }
        }finally {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        return null;
    }

    /*
     * Udate product by Id using dbo.product table
     * */

    public boolean createNewProduct(Product product) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = MyConnection.myConnection();
            if (con != null){
                String sql = "INSERT INTO dbo.Product(productname,description,picture,categoriesid) " +
                        "VALUES(?, ?, ?,?) ";
                stm = con.prepareStatement(sql);
                stm.setString(1, product.getProductname());
                stm.setString(2, product.getDescription());
                stm.setString(3, product.getPicture());
                stm.setInt(4, product.getCategoriesid());
                int row = stm.executeUpdate();
                if (row > 0){
                    return true;
                }
            }
        }finally {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
            if (con != null) con.close();
        }

        return false;
    }


    /*
     * Create new product using dbo.product
     * */

    public boolean updateProById(int proId, String proName, String des, String pic, int cate) throws SQLException, ClassNotFoundException{

        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = MyConnection.myConnection();
            if (con != null){
                String sql =
                        "UPDATE dbo.Product " +
                                "SET productname = ?, description = ?, picture = ?, categoriesid = ? " +
                        "WHERE productid = ?";

                stm = con.prepareStatement(sql);

                stm.setString(1, proName);
                stm.setString(2, des);
                stm.setString(3, pic);
                stm.setInt(4, cate);
                stm.setInt(5, proId);
                int row = stm.executeUpdate();
                if (row > 0){
                    return true;
                }
            }
        }finally {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        return false;
    }

}
