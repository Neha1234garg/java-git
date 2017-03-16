package com.ShoppingCart.Services;

import com.ShoppingCart.DAO.ProductDaoImplements;
import com.ShoppingCart.DAO.*;
import com.ShoppingCart.Domain.*;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
public class ProductServiceImpl implements ProductService {
    public void addProduct(Product product) {

        ProductDaoImplements ob = new ProductDaoImplements();
        ob.ProductDaoInsert(product);

    }
    public void updateProduct(int id,String code,String name,int quantity,int unitprice){
        ProductDaoImplements ob = new ProductDaoImplements();
        ob.ProductDaoUpdate(id,code,name,quantity,unitprice);
    }
    public List<Product> selectallProduct(){
        ProductDaoImplements ob = new ProductDaoImplements();
        return ob.getAllProduct();
    }
    public void delProduct(int id){
        ProductDaoImplements ob = new ProductDaoImplements();
        try {
            ob.ProductDaoDelete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}