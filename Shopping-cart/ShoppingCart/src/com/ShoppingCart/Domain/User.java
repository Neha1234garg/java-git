package com.ShoppingCart.Domain;

/**
 * Created by nehagarg on 2/17/17.
 */
public class User {
    private  int User_id;
    private  String User_name;
    private   String Address;
    private  String User_email;
    private  String User_phone;


    public User() {
    }

    public User(String user_name, String address, String user_email, String user_phone) {
        User_name = user_name;
        Address = address;
        User_email = user_email;
        User_phone = user_phone;
    }

    public User(int userId, String name, String address, String email, String phone) {
        User_id = userId;
        User_name = name;
        Address = address;
        User_email = email;
        User_phone = phone;
    }


    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String user_email) {
        User_email = user_email;
    }

    public String getUser_phone() {
        return User_phone;
    }

    public void setUser_phone(String user_phone) {
        User_phone = user_phone;
    }

    public String toString() {
        return "User{" +
                "userId=" + User_id +
                ", name='" + User_name + '\'' +
                ", address='" + Address + '\'' +
                ", email='" + User_email + '\'' +
                ", phone='" + User_phone + '}';

    }
}
