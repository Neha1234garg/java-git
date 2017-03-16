package com.ShoppingCart.Services;

import com.ShoppingCart.Domain.Product;
import com.ShoppingCart.Domain.User;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
public interface ProductService {
    public void addProduct(Product product);
    public void updateProduct(int id,String code,String name,int quantity,int unitprice);
   // public List<Product> selectallProduct();
    public void delProduct(int id);
}
