package com.ShoppingCart.Client;
import com.ShoppingCart.Domain.User;
import com.ShoppingCart.Services.UserServiceImpl;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nehagarg on 2/20/17.
 */



public class UserMain {
        public static void main(String[] args)  {

            List<User> users= null;
            UserServiceImpl odao=new UserServiceImpl();

            System.out.println("1. Insert a user.\n 2. Delete a user.\n 3. Select a user.\n4. Update a user. \n Enter your chioce:= ");
                Scanner sc=new Scanner(System.in);
                int ch=sc.nextInt();
                switch(ch)
                    {
                    case 1:{
                            try
                                {
                                    users = CSVFileReader.readUser();

                                    for(User user1:users)
                                    {
                                        odao.addUser(user1);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                              break;
                        }
                    case 2:
                    {
                            UserServiceImpl userService=new UserServiceImpl();
                            userService.delUser(442);
                            System.out.println("User Data has been deleted to databse " );
                            break;
                    }
                    case 3: {
                            try {
                                UserServiceImpl userService = new UserServiceImpl();
                                List<User> list = userService.selectallUser();
                                for (User user1 : list) {
                                    System.out.println(user1.toString());
                                }

                            } catch (Exception e) {
                            }
                            break;
                    }
                    case 4: {
                            try {
                                UserServiceImpl userService = new UserServiceImpl();
                                userService.updateUser(424,"neha","1234456778","address", "abc@google.com");
                                System.out.println("User Data has been updated to databse ");
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










