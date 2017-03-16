package com.ShoppingCart.Services;
import com.ShoppingCart.DAO.*;
import com.ShoppingCart.Domain.*;
import java.sql.SQLException;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
/**
 * Created by nehagarg on 2/20/17.
 */
public class OrderDetailServiceImpl implements OrderDetailService {


    public void addOrderDetail(OrderDetail orderdetail) {
        OrderDetailDaoImplements ob = new OrderDetailDaoImplements();
        ob.OrderDetailDaoInsert(orderdetail);


        //System.out.print(ob.OrderDetailDaoInsert(orderdetail.OrderDetail_id));
    }

    public void updateOrder(int id, OrderDetail orderdetail) {

        OrderDetailDaoImplements ob = new OrderDetailDaoImplements();
        ob.OrderDetailDaoUpdate(id, orderdetail);

    }
    public List<OrderDetail> selectAllOrderDetail()
    {
        OrderDetailDaoImplements ob = new OrderDetailDaoImplements();
        return ob.getAllOrderDetail();
    }
}
