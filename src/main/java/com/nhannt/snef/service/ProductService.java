package com.nhannt.snef.service;

import com.nhannt.snef.model.Product;
import com.nhannt.snef.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
public class ProductService {

    @Autowired
    ProductDAO proDao = new ProductDAO();

    /*
    * Get ALL Product API
    * */
    @RequestMapping(method = RequestMethod.GET, path = "/products", produces = "application/json")
    public List<Product> getAllPro() throws SQLException, ClassNotFoundException {

        List<Product> getList = proDao.loadAllProduct();
        System.out.println(getList.size());
        return getList;
    }

    /*
     * Get Product Name API
     * */

    @RequestMapping(method = RequestMethod.GET, value = "products/{name}", produces = "application/json")
    public List<Product> getProName(@PathVariable String name) throws SQLException, ClassNotFoundException{
        System.out.println("name: " + name);
        List<Product> getListName = proDao.searchProByName(name);
        System.out.println(getListName.size());
        return getListName;
    }

    /**
     * Create new product in table dbo.product
     * Method Post
     * Path: /products/create
     */
    @PostMapping(value = "/products/create")
    public boolean createNewProduct(@Valid @RequestBody Product product) throws SQLException, ClassNotFoundException {
        String proName = product.getProductname();
        String des = product.getDescription();
        String pic = product.getPicture();
        int cate = product.getCategoriesid();

        boolean result = proDao.createNewProduct(new Product(proName, des, pic, cate));
        System.out.println(result);

        return true;
    }

    /**
     * Update product by Id in table dbo.product
     * Method Post, path: /products/update
     */
    @PostMapping(value = "/products/update", produces = "application/json")
    public boolean updateProById(@Valid @RequestBody Product product) throws SQLException, ClassNotFoundException {
        int proId = product.getProductid();
        String proName = product.getProductname();
        String des = product.getDescription();
        String pic = product.getPicture();
        int cate = product.getCategoriesid();

        boolean rs = proDao.updateProById(proId,proName,des, pic, cate);

        return true;
    }
}
