package com.ShoppingCart.Domain;

import java.util.Date;

/**
 * `OD_ID` int(11) NOT NULL AUTO_INCREMENT,
 `OD_PRODUCT_ID` int(11) NOT NULL,
 `OD_QTY` int(3) NOT NULL,
 `OD_UNITPRICE` int(11) NOT NULL,
 `OD_TOTALPRICE` int(11) NOT NULL,
 `OD_ORDER_ID` int(11) NOT NULL,

 * Created by nehagarg on 2/19/17.
 */
public class OrderDetail {


    int OrderDetail_id;
    int OrderDetail_productid;
    int OrderDetail_quantity;
    int OrderDetail_unitprice;
    int OrderDetail_userid;

    public OrderDetail(int orderDetail_id, int orderDetail_productid, int orderDetail_quantity, int orderDetail_unitprice, int orderDetail_userid) {
        OrderDetail_id = orderDetail_id;
        OrderDetail_productid = orderDetail_productid;
        OrderDetail_quantity = orderDetail_quantity;
        OrderDetail_unitprice = orderDetail_unitprice;
        OrderDetail_userid = orderDetail_userid;
    }

    public OrderDetail() {
    }

    public OrderDetail(int orderDetail_productid, int orderDetail_quantity, int orderDetail_unitprice, int orderDetail_userid) {

        OrderDetail_productid = orderDetail_productid;
        OrderDetail_quantity = orderDetail_quantity;
        OrderDetail_unitprice = orderDetail_unitprice;
        OrderDetail_userid = orderDetail_userid;
    }

    public int getOrderDetail_id() {
        return OrderDetail_id;
    }

    public void setOrderDetail_id(int orderDetail_id) {
        OrderDetail_id = orderDetail_id;
    }

    public int getOrderDetail_productid() {
        return OrderDetail_productid;
    }

    public void setOrderDetail_productid(int orderDetail_productid) {
        OrderDetail_productid = orderDetail_productid;
    }

    public int getOrderDetail_quantity() {
        return OrderDetail_quantity;
    }

    public void setOrderDetail_quantity(int orderDetail_quantity) {
        OrderDetail_quantity = orderDetail_quantity;
    }

    public int getOrderDetail_unitprice() {
        return OrderDetail_unitprice;
    }

    public void setOrderDetail_unitprice(int orderDetail_unitprice) {
        OrderDetail_unitprice = orderDetail_unitprice;
    }

    public int getOrderDetail_userid() {
        return OrderDetail_userid;
    }

    public void setOrderDetail_userid(int orderDetail_userid) {
        OrderDetail_userid = orderDetail_userid;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "OrderDetail_id=" + OrderDetail_id +
                ", OrderDetail_productid=" + OrderDetail_productid +
                ", OrderDetail_quantity=" + OrderDetail_quantity +
                ", OrderDetail_unitprice=" + OrderDetail_unitprice +
                ", OrderDetail_userid=" + OrderDetail_userid +
                '}';
    }
}
