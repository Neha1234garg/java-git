package com.ShoppingCart.Services;

import com.ShoppingCart.DAO.DBConnection;
import com.ShoppingCart.DAO.UserDaoImplements;
import com.ShoppingCart.Domain.User;
import java.sql.Connection;
import java.util.List;
import com.ShoppingCart.Client.CSVFileReader;

/**
 * Created by nehagarg on 2/20/17.
 */
public class UserServiceImpl implements UserService {


    @Override
    public void addUser(User user) {

        UserDaoImplements ob = new UserDaoImplements();

        ob.UserDaoInsert(user);


    }
    public void updateUser(int id,String name, String phone, String address, String email ) {
        UserDaoImplements ob = new UserDaoImplements();
        ob.UserDaoUpdate(id,name,phone,address,email);
    }


    public List<User> selectallUser(){
        UserDaoImplements ob = new UserDaoImplements();
        return ob.getAllUsers();
        //return null;
    }

    public void delUser(int id1){
        UserDaoImplements ob = new UserDaoImplements();
        try {
            ob.UserDaoDelete(id1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
