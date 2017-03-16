package com.ShoppingCart.Client;
import com.ShoppingCart.Domain.Product;
import com.ShoppingCart.Domain.*;
import com.ShoppingCart.Services.OrderServiceImpl;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Created by nehagarg on 2/19/17.
 */
public class CSVFileReader {

    final static List<User> users = new ArrayList<User>();
    //final static List<Order> orders = new ArrayList<Order>();

    ///static   Order order = new Order();
    //static OrderDetail orderDetail = new OrderDetail();

    public static List<User> readUser() throws Exception {
        FileInputStream fis = new FileInputStream("resources/csvUser.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String row = br.readLine();
        try {
            while (row != null) {
                String[] comSepersted = row.split(",");
                int u_id = Integer.parseInt(comSepersted[0]);
                String u_name = comSepersted[1];
                String u_add = comSepersted[2];
                String u_email = comSepersted[3];
                String u_phone = comSepersted[4];

                User user = new User();
                user.setUser_id(u_id);
                user.setUser_name(u_name);
                user.setAddress(u_add);
                user.setUser_email(u_email);
                user.setUser_phone(u_phone);

                users.add(user);
                row = br.readLine();   //to read next row of file
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }


    final static List<Order> orders = new ArrayList<Order>();

    public static List<Order> readOrder() throws Exception {

        FileInputStream fis = new FileInputStream("resources/csvOrder.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String row = br.readLine();
        //Product p=new Product();
        try {
            while (row != null) {
                String[] comSepersted = row.split(",");
                int u_id = Integer.parseInt(comSepersted[0]);
                int total = Integer.parseInt(comSepersted[1]);

                System.out.println("sdfghg" + u_id);

                //Order o=new Order(u_id,total);
                Order o = new Order();
                o.setOrder_userid((u_id));
                o.setAmount(total);


                orders.add(o);
                row = br.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        OrderServiceImpl odi=new OrderServiceImpl();
//
//        odi.addOrder(order);
        return orders;
        //return null;
    }



    final static List<Product> products = new ArrayList<Product>();

    public static List<Product> readProduct() throws Exception {
        /*String Product_code;
    String Product_name;
    int Product_quantity;
    int Product_unitprice;*/

        FileInputStream fis = new FileInputStream("resources/csvProduct.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String row = br.readLine();
        //Product p=new Product();
        try {
            while (row != null) {
                String[] comSepersted = row.split(",");
                int p_id= Integer.parseInt(comSepersted[0]);
                String p_code=comSepersted[1];
                String p_name=comSepersted[2];
                int quan = Integer.parseInt(comSepersted[3]);
                int unit_price = Integer.parseInt(comSepersted[4]);

                System.out.println("sdfghg" + unit_price);

                //Order o=new Order(u_id,total);
                Product p = new Product();
                p.setProduct_code(p_code);
                p.setProduct_name(p_name);
                p.setProduct_quantity(quan);
                p.setProduct_unitprice(unit_price);

                products.add(p);
                row = br.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        OrderServiceImpl odi=new OrderServiceImpl();
//        odi.addOrder(order);
        return products;
        //return null;
    }




    final static List<OrderDetail> orderdetails = new ArrayList<OrderDetail>();

    public static List<OrderDetail> readOrderDetail() throws Exception {

        FileInputStream fis = new FileInputStream("resources/csvOrderDetails.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String row = br.readLine();
        //Product p=new Product();
        try {
            while (row != null) {
                String[] comSepersted = row.split(",");
               // int od_id = Integer.parseInt(comSepersted[0]);
                int p_id = Integer.parseInt(comSepersted[0]);
                int quan = Integer.parseInt(comSepersted[1]);
                int u_price = Integer.parseInt(comSepersted[2]);
                int u_id = Integer.parseInt(comSepersted[3]);

                //System.out.println("sdfghg" + u_id);

                //Order o=new Order(u_id,total);
                OrderDetail od = new OrderDetail();
                //od.setOrderDetail_id(od_id);
                od.setOrderDetail_productid(p_id);
                od.setOrderDetail_quantity(quan);
                od.setOrderDetail_unitprice(u_price);
                od.setOrderDetail_userid((u_id));

                orderdetails.add(od);
                row = br.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        OrderServiceImpl odi=new OrderServiceImpl();
//
//        odi.addOrder(order);
        return orderdetails;
        //return null;
    }
}