package com.ShoppingCart.Services;

import com.ShoppingCart.Domain.Order;
import com.ShoppingCart.Domain.OrderDetail;
import com.ShoppingCart.Domain.User;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
public interface OrderDetailService {
    public void addOrderDetail(OrderDetail orderDetail);
   // public void updateOrder(int id,OrderDetail orderdetail);
    public List<OrderDetail> selectAllOrderDetail();
}
