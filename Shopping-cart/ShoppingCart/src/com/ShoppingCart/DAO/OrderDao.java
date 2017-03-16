package com.ShoppingCart.DAO;

import com.ShoppingCart.Domain.Order;

import com.ShoppingCart.Domain.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import com.ShoppingCart.Domain.User;
import javax.jws.soap.SOAPBinding;

public interface OrderDao {

         public void OrderDaoInsert(Order order);
         public void OrderDaoUpdate (int id,int u_id,int total);
         public List<Order> getAllOrder();
    public void Bill(int userid);
    }





