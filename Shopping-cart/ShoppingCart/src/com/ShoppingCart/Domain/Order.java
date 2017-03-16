package com.ShoppingCart.Domain;

import java.util.Date;

/**
 * Created by nehagarg on 2/18/17.
 */
public class Order {

    int Order_id;
    int Order_userid;
   int amount;

    @Override
    public String toString() {
        return "Order{" +
                "Order_id=" + Order_id +
                ", Order_userid=" + Order_userid +
                ", amount=" + amount +
                '}';
    }

    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int order_id) {
        Order_id = order_id;
    }

    public int getOrder_userid() {
        return Order_userid;
    }

    public void setOrder_userid(int order_userid) {
        Order_userid = order_userid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Order() {

    }

    public Order(int order_userid, int amount) {

        Order_userid = order_userid;
        this.amount = amount;
    }

    public Order(int order_id, int order_userid, int amount) {

        Order_id = order_id;
        Order_userid = order_userid;
        this.amount = amount;
    }
}
