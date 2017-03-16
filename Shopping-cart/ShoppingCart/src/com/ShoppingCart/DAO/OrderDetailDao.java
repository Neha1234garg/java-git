package com.ShoppingCart.DAO;

import com.ShoppingCart.Domain.Order;
import com.ShoppingCart.Domain.OrderDetail;
import com.ShoppingCart.Domain.Product;
import com.ShoppingCart.Domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

/**
 * Created by nehagarg on 2/19/17.
 */
public interface OrderDetailDao
{
           //void OrderDetailDaoInsert(OrderDetail orderdetail);
           public void OrderDetailDaoUpdate (int id,OrderDetail orderdetail);
           //public List<OrderDetail> getAllOrderDetail();

    }
