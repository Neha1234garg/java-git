package com.ShoppingCart.Client;

import com.ShoppingCart.DAO.OrderDetailDao;
import com.ShoppingCart.DAO.OrderDetailDaoImplements;
import com.ShoppingCart.Domain.Product;
import com.ShoppingCart.Services.OrderDetailService;
import java.util.Scanner;

import com.ShoppingCart.Domain.OrderDetail;

import com.ShoppingCart.Services.OrderDetailServiceImpl;

import java.util.List;

/**
 * Created by nehagarg on 2/19/17.
 */

public class OrderDetailMain {

    public static void main(String[] args) {

        System.out.println("1. Insert OrderDetails.\n 2. Select OrderDetails.\n 3. Update OrderDetails. \n Enter your chioce:= ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:{
                List<OrderDetail> orderDetails = null;

                OrderDetail odetail1 = new OrderDetail();

                OrderDetailServiceImpl orderDetailService = new OrderDetailServiceImpl();
                OrderDetailServiceImpl orderDetailServiceImpl = new OrderDetailServiceImpl();
                try {
                    orderDetails = CSVFileReader.readOrderDetail();

                    for (OrderDetail odetail : orderDetails) {
                        orderDetailService.addOrderDetail(odetail);
                    }
                } catch (Exception e) {}

                break;
            }
            case 2:{
                try {
                    OrderDetailServiceImpl orderdetailservice = new OrderDetailServiceImpl();
                    List<OrderDetail> list = orderdetailservice.selectAllOrderDetail();
                    for (OrderDetail od1 : list) {
                        System.out.println(od1.toString());
                    }

                } catch (Exception e) {
                }

                break;
            }
            case 3:{
                try{
                    // OD_PRODUCT_ID = ?, OD_QTY = ?, OD_UNITPRICE = ?, U_ID = ?  where ORDER_ID = ? "
                    OrderDetail od = new OrderDetail();
                    Product pro=new Product();
                    OrderDetailServiceImpl od1= new OrderDetailServiceImpl();
                    od.setOrderDetail_productid(213);
                    od.setOrderDetail_quantity(2);
                    od.setOrderDetail_unitprice(10);
                    od.setOrderDetail_userid(428);

                    od1.updateOrder(56,od);
                    System.out.println("Order Detail Data has been updated to databse ");


                }catch(Exception e){}

                break;
            }
        }


    }
}

