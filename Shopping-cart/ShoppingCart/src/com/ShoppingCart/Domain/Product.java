package com.ShoppingCart.Domain;

/**
 * Created by nehagarg on 2/17/17.
 */
public class Product {


    int Product_id;
    String Product_code;
    String Product_name;
    int Product_quantity;
    int Product_unitprice;

    public Product() {
    }

    public Product(int product_id, String product_code, String product_name, int product_quantity, int product_unitprice) {
        Product_id = product_id;
        Product_code = product_code;
        Product_name = product_name;
        Product_quantity = product_quantity;
        Product_unitprice = product_unitprice;
    }

    public Product(String product_code, String product_name, int product_quantity, int product_unitprice) {
        Product_code = product_code;
        Product_name = product_name;
        Product_quantity = product_quantity;
        Product_unitprice = product_unitprice;
    }

    public int getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(int product_id) {
        Product_id = product_id;
    }

    public String getProduct_code() {
        return Product_code;
    }

    public void setProduct_code(String product_code) {
        Product_code = product_code;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public int getProduct_quantity() {
        return Product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        Product_quantity = product_quantity;
    }

    public int getProduct_unitprice() {
        return Product_unitprice;
    }

    public void setProduct_unitprice(int product_unitprice) {
        Product_unitprice = product_unitprice;
    }
    public String toString() {
        return "Product{" +
                "productId=" + Product_id +
                ", code='" + Product_code + '\'' +
                ", name='" + Product_quantity + '\'' +
                ", quantity='" + Product_quantity + '\'' +
                ", unitprice='" + Product_unitprice + '}';

    }
}
