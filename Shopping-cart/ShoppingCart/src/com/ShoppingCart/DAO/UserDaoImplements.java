package com.ShoppingCart.DAO;
import com.ShoppingCart.Domain.User;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by nehagarg on 2/20/17.
 */
 public class UserDaoImplements implements UserDao {

    public void UserDaoInsert (User user)  {
        String name = user.getUser_name();
        int userId = user.getUser_id();
        String address = user.getAddress();
        String email = user.getUser_email();
        String phone = user.getUser_phone();
        Connection conn = DBConnection.getConnection();

        PreparedStatement pps = null;

        try {
            pps = conn.prepareStatement("INSERT INTO USER (USER_ID,USER_NAME,USER_ADDRESS,PHONE,USER_EMAIL)VALUES (null,?,?,?,?)");


        pps.setString(1, name);
        pps.setString(2, address);
        pps.setString(3, email);
        pps.setString(4, phone);

        pps.execute();

        System.out.println("User Data has been saved to databse with primary Key :" + userId);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }

    public void UserDaoUpdate (int id,String name,String address,String phone,String email)  {

        Connection conn = DBConnection.getConnection();

        PreparedStatement pps = null;
        try {
            pps = conn.prepareStatement("update USER set USER_NAME = ?, USER_ADDRESS = ?, PHONE = ?, USER_EMAIL = ?  where USER_ID = ? ");

            pps.setString(1, name);
            pps.setString(2, address);
            pps.setString(3, phone);
            pps.setString(4, email);
            pps.setInt(5,id);
            pps.execute();

            System.out.println("HIIIIIIIIII");
            System.out.println(name);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }

    public void UserDaoDelete(int userId)throws Exception
    {
        Connection conn= DBConnection.getConnection();

        String sql="Delete from USER where USER_ID= "+userId;
        System.out.println("hiiiiiiiii");

        PreparedStatement pst=conn.prepareStatement(sql);
        pst.executeUpdate(sql);
        System.out.println("User with USER_ID :"+userId+" has been removed successfully");


    }
    public List<User> getAllUsers()
    {
        List<User> users=new ArrayList<User>();
        Connection conn= null;

        try {
            conn = DBConnection.getConnection();
            Statement stmt=conn.createStatement();
            String sql = "SELECT * FROM USER";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){

                int id = rs.getInt("USER_ID");
                String name= rs.getString("USER_NAME");

                String address = rs.getString("USER_ADDRESS");
                String phone = rs.getString("PHONE");
                String email = rs.getString("USER_EMAIL");

                User user=new User(id,name,address,email,phone);
                users.add(user);
            }
            rs.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return users;
    }

}
