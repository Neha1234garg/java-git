package com.ShoppingCart.DAO;
import com.ShoppingCart.Domain.User;
import java.sql.*;
import java.util.List;

import com.ShoppingCart.Domain.Product;


/**
 *
 * Created by nehagarg on 2/17/17.
 */
public interface ProductDao {
    void ProductDaoInsert(Product product);

    void ProductDaoUpdate(int id,String code,String name,int quantity,int unitprice);
    void ProductDaoDelete(int productId)throws Exception;

}
