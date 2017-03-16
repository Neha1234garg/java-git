package com.ShoppingCart.Client;

import com.ShoppingCart.Services.*;

import com.ShoppingCart.Domain.Product;
import java.util.List;
import java.util.Scanner;


public class ProductMain {
    public static void main(String[] args) {
        List<Product> products=null;

        Product product1 = new Product();

        ProductServiceImpl productService = new ProductServiceImpl();

        System.out.println("1. Insert a product.\n 2. Delete a product.\n 3. Select a product.\n4. Update a product. \n Enter your chioce:= ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            case 1:{
                try{
                    products = CSVFileReader.readProduct();
                    for(Product prod :products)
                    {
                        productService.addProduct(prod);
                    }
                    }catch (Exception e){}
                     break;
                    }
            case 2:{
                try{
                    productService.delProduct(212);
                    System.out.println("Product Data has been deleted to databse " );
                }catch(Exception e){}
                break;
            }

            case 3:{
                try{
                    List<Product> list= productService.selectallProduct();
                    for(Product prod:list){
                        System.out.println(prod.toString());
                        //System.out.println("sdfghjklredfghjknlm");
                    }

            }catch(Exception e){}
            break;
            }
            case 4: {
                try {
                    productService.updateProduct(210,"code6","prod6",6,100);
                    //System.out.println(product1.toString());
                    System.out.println("Product Data has been updated to databse " );
                } catch (Exception e) {
                }
                break;
            }


            default:
                System.out.println("Enter the correct no.");
                break;
        }

    }
}

