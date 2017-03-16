package com.ShoppingCart.DAO;
import com.ShoppingCart.Services.*;
import com.ShoppingCart.Domain.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ShoppingCart.Domain.Product;
import com.ShoppingCart.Domain.User;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */


public class OrderDetailDaoImplements implements OrderDetailDao {


    public void OrderDetailDaoInsert(OrderDetail orderdetail) {

        PreparedStatement preparedStatement = null;

        Connection con = DBConnection.getConnection();

        int orderDetail_ooid = orderdetail.getOrderDetail_id();
        int orderDetail_productid = orderdetail.getOrderDetail_productid();
        int orderDetail_quantity = orderdetail.getOrderDetail_quantity();
        int orderDetail_unitprice = orderdetail.getOrderDetail_unitprice();
        int orderDetail_userid = orderdetail.getOrderDetail_userid();

        System.out.println("aaaaaaaaaaa        " + orderDetail_productid);

        try {
            preparedStatement = con.prepareStatement("INSERT INTO ORDER_DETAILS_INDIVIDUAL (OD_PRODUCT_ID,OD_QTY,OD_UNITPRICE,U_ID) VALUES (?,?,?,?)");
            preparedStatement.setInt(1, orderDetail_productid);
            preparedStatement.setInt(2, orderDetail_quantity);
            preparedStatement.setInt(3, orderDetail_unitprice);
            preparedStatement.setInt(4, orderDetail_userid);

            preparedStatement.execute();


            System.out.println("Order Detail Data has been saved to databse");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void OrderDetailDaoUpdate(int id, OrderDetail orderdetail) {
       // product_dao p = new product_dao();
        int quan;
        Product pro = new Product();


        Connection conn = DBConnection.getConnection();

        ////ProductDaoImplements pdao=new ProductDaoImplements();


        int orderDetail_id = id;
        int orderDetail_productid = orderdetail.getOrderDetail_productid();
        int orderDetail_quantity = orderdetail.getOrderDetail_quantity();
        int orderDetail_unitprice = orderdetail.getOrderDetail_unitprice();
        int orderDetail_userid = orderdetail.getOrderDetail_userid();




        PreparedStatement preparedStatement = null;


       // Product punit=pdao.getAllProduct(orderDetail_id);

            try {
                preparedStatement = conn.prepareStatement("update ORDER_DETAILS_INDIVIDUAL set OD_PRODUCT_ID = ?, OD_QTY = ?, OD_UNITPRICE = ?, U_ID = ?  where OD_ID = ? ");

                preparedStatement.setObject(1, orderDetail_productid);
                preparedStatement.setInt(2, orderDetail_quantity);

                preparedStatement.setInt(3, orderDetail_unitprice);
                preparedStatement.setObject(4, orderDetail_userid);
                preparedStatement.setObject(5, orderDetail_id);
                preparedStatement.execute();
                System.out.println("OrderDetail Data has been UPDATED to databse");
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {

                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

    }

    public List<OrderDetail> getAllOrderDetail() {

        List<OrderDetail> l1 = new ArrayList<OrderDetail>();
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from ORDER_DETAILS_INDIVIDUAL";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int OrderDetail_id = rs.getInt("OD_ID");
                int OrderDetail_productid = rs.getInt("OD_PRODUCT_ID");
                int OrderDetail_quantity = rs.getInt("OD_QTY");
                int OrderDetail_unitprice = rs.getInt("OD_UNITPRICE");
                int OrderDetail_userid = rs.getInt("U_ID");

                OrderDetail od = new OrderDetail(OrderDetail_id, OrderDetail_productid, OrderDetail_quantity, OrderDetail_unitprice, OrderDetail_userid);
                l1.add(od);

            }
            rs.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return l1;
    }
}




