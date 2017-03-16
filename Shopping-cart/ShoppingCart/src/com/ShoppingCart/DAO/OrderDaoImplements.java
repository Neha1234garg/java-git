package com.ShoppingCart.DAO;
import com.ShoppingCart.Domain.Order;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a program to iterate ArrayList using enumeration
 * Created by nehagarg on 2/20/17.
 */
public class OrderDaoImplements implements OrderDao {

    public void OrderDaoInsert(Order order) {

            int orderId = order.getOrder_id();
            int order_userid = order.getOrder_userid();
            int amount = order.getAmount();

        Connection con =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
       System.out.println("kjhgfxcgvhbjn     "+order_userid);


        try {
            preparedStatement=con.prepareStatement("insert into ORDERS(ORDER_USERID,AMOUNT) values(?,?)");
            preparedStatement.setInt(1,order_userid);
            preparedStatement.setInt(2,amount);

            preparedStatement.execute();
            System.out.println("Order Data has been saved to databse with primary Key :" + orderId);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        }
    }

    public void OrderDaoUpdate (int id,int u_id,int total)  {

           Connection conn = DBConnection.getConnection();

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement("update ORDERS set ORDER_USERID = ?, AMOUNT = ? where ORDER_ID = ? ");
            preparedStatement.setObject(1, u_id);
            preparedStatement.setInt(2,total);
            preparedStatement.setInt(3,id);


            preparedStatement.execute();
            System.out.println("sdxfcgvhbjk"+total);

            System.out.println("Order Data has been UPDATED to databse");
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

    public List<Order> getAllOrder() {
        List<Order> orderList = new ArrayList<Order>();
        Order order1 = null;


        PreparedStatement preparedStatement = null;
        Connection conn = null;
        ResultSet rs = null;


        try {
            conn = DBConnection.getConnection();

            String sql = "select * from ORDERS";

            PreparedStatement pst = conn.prepareStatement(sql);

            rs = pst.executeQuery(sql);
            while (rs.next()) {


                int orderId = rs.getInt("ORDER_ID");

                int userid = rs.getInt("ORDER_USERID");
                int amount = rs.getInt("AMOUNT");




                order1 = new Order(orderId,userid,amount);
                orderList.add(order1);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return orderList;
    }



    public void Bill(int userid){
        String filename ="Desktop:Bill.csv";
        try {
            FileWriter fw = new FileWriter(filename);
            Connection con =DBConnection.getConnection();
            Statement stmt = con.createStatement();

            String q1 = "select * from USER,ORDERS where ORDERS.ORDER_USERID=USER.USER_ID && USER.USER_ID = "+userid;
            ResultSet rs1 = stmt.executeQuery(q1);
            while(rs1.next()) {
                fw.append("User Id : ");
                fw.append(rs1.getString(1));
                //fw.append('\n');
                fw.append(',');
                fw.append("User Name :");
                fw.append(rs1.getString(2));
                fw.append('\n');
            }
            fw.append("Product_Id");
            fw.append(',');
            fw.append("Product_Name");
            fw.append(',');
            fw.append("Quantity");
            fw.append(',');
            fw.append("Product_Price");
            fw.append(',');
            fw.append("total");
            fw.append("\n");
            String query = "select PRODUCT_ID,PRODUCT_NAME,PRODUCT_QUANTITY,PRODUCT_UNITPRICE from PRODUCT,ORDER_DETAILS_INDIVIDUAL where ORDER_DETAILS_INDIVIDUAL.OD_PRODUCT_ID= PRODUCT.PRODUCT_ID && ORDER_DETAILS_INDIVIDUAL.U_ID = "+userid;
            ResultSet rs = stmt.executeQuery(query);
            int grandTotal = 0;
            while (rs.next()) {
                fw.append(rs.getString(1));
                fw.append(',');
                fw.append(rs.getString(2));
                fw.append(',');
                fw.append(rs.getString(3));
                fw.append(',');
                fw.append(rs.getString(4));
                fw.append(',');
                int qty = Integer.parseInt(rs.
                        getString(3));
                int price = Integer.parseInt(rs.getString(4));
                int ttl = qty * price;
                grandTotal += ttl;
                fw.append(Integer.toString(ttl));
                fw.append('\n');
                // int total
            }
            String q3 = "select * from ORDERS where ORDER_USERID = "+userid;
            ResultSet rs3 = stmt.executeQuery(q3);
            while (rs3.next()) {
                fw.append("Order Id :");
                fw.append(rs3.getString(1));
                fw.append(", , ");
                fw.append(',');
                fw.append("Grand Total :");
                fw.append(',');
                fw.append(Integer.toString(grandTotal));
                //fw.append()
                fw.append('\n');
            }
            fw.flush();
            fw.close();
            con.close();
            System.out.println("CSV File  created successfully.");
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }

}
