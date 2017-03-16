package com.ShoppingCart.Client;

import com.ShoppingCart.Domain.Order;
import com.ShoppingCart.Services.OrderServiceImpl;
import java.sql.SQLException;
import java.io.*;
import java.sql.*;
import com.ShoppingCart.DAO.*;
import java.util.List;
import java.util.Scanner;


/**
 * Created by nehagarg on 2/18/17.
 */

public class OrderMain {

    public static void main(String[] args) throws SQLException {



        System.out.println("1. Insert an order.\n 2. Select all order.\n 3. Bill generation. \n Enter your chioce:= ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:{

                List<Order> order = null;

                //Order o1 = null;

                OrderServiceImpl orderService = new OrderServiceImpl();
                OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
                try {
                    order = CSVFileReader.readOrder();

                    for (Order o1 : order) {
                        orderService.addOrder(o1);
                    }
                } catch (Exception e) {}

            break;
            }
            case 2:{
                try {
                    OrderServiceImpl orderservice = new OrderServiceImpl();
                    List<Order> list = orderservice.SelectallOrder();
                    for (Order o1 : list) {
                        System.out.println(o1.toString());
                    }

                } catch (Exception e) {
                }

                break;
            }


            case 3:{
                OrderServiceImpl orderservice = new OrderServiceImpl();
                System.out.println("Enter user id to generate corresponding CSV: ");
                Scanner sc1=new Scanner(System.in);
                int userid=sc1.nextInt();
               // OrderMain bill=new OrderMain();
                orderservice.billGeneration(userid);
                break;

            }
        }

    }
}




