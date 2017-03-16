package com.ShoppingCart.DAO;
import com.ShoppingCart.Domain.Product;
import com.ShoppingCart.Domain.User;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
 public class ProductDaoImplements implements ProductDao{

    public void ProductDaoInsert(Product product){

        int productId = product.getProduct_id();
        String code = product.getProduct_code();
        String name = product.getProduct_name();
        int quan = product.getProduct_quantity();
        int unitprice = product.getProduct_unitprice();

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement pps = conn.prepareStatement("INSERT INTO PRODUCT VALUES (null,?,?,?,?)");

            pps.setString(1, code);
            pps.setString(2, name);
            pps.setInt(3, quan);
            pps.setInt(4, unitprice);

            pps.execute();

            System.out.println("ProducT Data has been saved to databse with primary Key :" + productId);
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }



    public void ProductDaoUpdate (int id,String code,String name,int quantity,int unitprice)  {

        Connection conn = DBConnection.getConnection();

        PreparedStatement pps = null;
        try {
            pps = conn.prepareStatement("update PRODUCT set PRODUCT_CODE = ?, PRODUCT_NAME = ?, PRODUCT_QUANTITY = ?, PRODUCT_UNITPRICE = ?  where PRODUCT_ID = ? ");

            pps.setString(1, code);
            pps.setString(2, name);
            pps.setInt(3, quantity);
            pps.setInt(4, unitprice);
            pps.setInt(5,id);
            System.out.println("HIIIIIIIIII");
            pps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }


    public void ProductDaoDelete(int productId)throws Exception
    {

        Connection conn= DBConnection.getConnection();

                String sql="Delete from PRODUCT where PRODUCT_ID= "+productId;
                System.out.println("hiiiiiiiii");

                PreparedStatement pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
                System.out.println("PRODUCT with PRODUCT_ID :"+productId+" has been removed successfully");


    }




    public List<Product> getAllProduct()
    {
        List<Product> products=new ArrayList<Product>();
        Connection conn= null;

        try {
            conn = DBConnection.getConnection();
            Statement stmt=conn.createStatement();
            String sql = "SELECT * FROM PRODUCT";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){

                int productId = rs.getInt("PRODUCT_ID");
                String code = rs.getString("PRODUCT_CODE");
                String name = rs.getString("PRODUCT_NAME");
                int quan = rs.getInt("PRODUCT_QUANTITY");
                int unitprice = rs.getInt("PRODUCT_UNITPRICE");

                Product product=new Product(productId,code,name,quan,unitprice);
                products.add(product);
            }
            rs.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return products;
    }

}

