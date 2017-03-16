package com.ShoppingCart.Services;

import com.ShoppingCart.Domain.*;
import com.ShoppingCart.DAO.*;
import com.sun.org.apache.xpath.internal.operations.Or;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
public class OrderServiceImpl implements OrderService{

     public void addOrder(Order order){
         OrderDaoImplements ob = new OrderDaoImplements();
        ob.OrderDaoInsert(order);
     }
     public void updateOrder(int id,int u_id,int total)
     {
         OrderDaoImplements ob = new OrderDaoImplements();
         ob.OrderDaoUpdate(id,u_id,total);

     }

     public List<Order> SelectallOrder()
     {
         OrderDaoImplements ob = new OrderDaoImplements();
         return ob.getAllOrder();
     }
    /*public void delOrder(int id,Order order){
        OrderDaoImplements ob = new OrderDaoImplements();
        try {
            ob.OrderDaoDelete(id,order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    public void billGeneration(int userid){
        OrderDaoImplements ob = new OrderDaoImplements();
        ob.Bill(userid);
    }
//        String filename ="Desktop:Bill.csv";
//        try {
//            FileWriter fw = new FileWriter(filename);
//            Connection con =DBConnection.getConnection();
//            Statement stmt = con.createStatement();
//
//            String q1 = "select * from USER,ORDERS where ORDERS.ORDER_USERID=USER.USER_ID && USER.USER_ID = "+userid;
//            ResultSet rs1 = stmt.executeQuery(q1);
//            while(rs1.next()) {
//                fw.append("User Id : ");
//                fw.append(rs1.getString(1));
//                //fw.append('\n');
//                fw.append(',');
//                fw.append("User Name :");
//                fw.append(rs1.getString(2));
//                fw.append('\n');
//            }
//            fw.append("Product_Id");
//            fw.append(',');
//            fw.append("Product_Name");
//            fw.append(',');
//            fw.append("Quantity");
//            fw.append(',');
//            fw.append("Product_Price");
//            fw.append(',');
//            fw.append("total");
//            fw.append("\n");
//            String query = "select PRODUCT_ID,PRODUCT_NAME,PRODUCT_QUANTITY,PRODUCT_UNITPRICE from PRODUCT,ORDER_DETAILS_INDIVIDUAL where ORDER_DETAILS_INDIVIDUAL.OD_PRODUCT_ID= PRODUCT.PRODUCT_ID && ORDER_DETAILS_INDIVIDUAL.U_ID = "+userid;
//            ResultSet rs = stmt.executeQuery(query);
//            int grandTotal = 0;
//            while (rs.next()) {
//                fw.append(rs.getString(1));
//                fw.append(',');
//                fw.append(rs.getString(2));
//                fw.append(',');
//                fw.append(rs.getString(3));
//                fw.append(',');
//                fw.append(rs.getString(4));
//                fw.append(',');
//                int qty = Integer.parseInt(rs.
//                        getString(3));
//                int price = Integer.parseInt(rs.getString(4));
//                int ttl = qty * price;
//                grandTotal += ttl;
//                fw.append(Integer.toString(ttl));
//                fw.append('\n');
//                // int total
//            }
//            String q3 = "select * from ORDERS where ORDER_USERID = "+userid;
//            ResultSet rs3 = stmt.executeQuery(q3);
//            while (rs3.next()) {
//                fw.append("Order Id :");
//                fw.append(rs3.getString(1));
//                fw.append(", , ");
//                fw.append(',');
//                fw.append("Grand Total :");
//                fw.append(',');
//                fw.append(Integer.toString(grandTotal));
//                //fw.append()
//                fw.append('\n');
//            }
//            fw.flush();
//            fw.close();
//            con.close();
//            System.out.println("CSV File  created successfully.");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
}
