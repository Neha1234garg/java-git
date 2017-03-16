package com.ShoppingCart.DAO;

        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

        import com.ShoppingCart.Domain.User;
        import java.util.Scanner;

public interface UserDao {

        void UserDaoInsert(User user) throws SQLException;
        void UserDaoUpdate(int id,String name, String phone, String address, String email);
        void UserDaoDelete(int userId)throws Exception;

}
