package com.ShoppingCart.Services;

import com.ShoppingCart.Domain.Order;
import com.ShoppingCart.Domain.User;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
public interface OrderService {
    public void addOrder(Order order);
    public void updateOrder(int id,int u_id,int total);
   // public void delOrder(int id,Order order);
    public List<Order> SelectallOrder();
   public void billGeneration(int userid);
}
