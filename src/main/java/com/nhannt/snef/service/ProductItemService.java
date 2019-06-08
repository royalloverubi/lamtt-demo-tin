package com.nhannt.snef.service;

import com.nhannt.snef.model.ProductItem;
import com.nhannt.snef.repository.ProductItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController

public class ProductItemService {

    @Autowired
    ProductItemDAO productItemDAO = new ProductItemDAO();

    @RequestMapping(method = RequestMethod.GET, value = "/items")
    public List<ProductItem> getAll() throws SQLException, ClassNotFoundException {
        List<ProductItem> items = productItemDAO.loadAllItem();
        return items;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/items/{id}", produces = "application/json")
    public List<ProductItem> getById(@PathVariable String id) throws SQLException, ClassNotFoundException {
        int itemId = Integer.parseInt(id);
        List<ProductItem> itemsById = productItemDAO.loadItemById(itemId);
        return  itemsById;
    }
}
