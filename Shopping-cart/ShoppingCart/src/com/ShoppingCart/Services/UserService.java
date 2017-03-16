package com.ShoppingCart.Services;
import com.ShoppingCart.Domain.*;
import java.util.List;

/**
 * Created by nehagarg on 2/20/17.
 */
public interface UserService {
    public void addUser(User user);
    public void updateUser(int id,String name, String phone, String address, String email);
    //public List<User> selectallUser();
    public void delUser(int id);

}
