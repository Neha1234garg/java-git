package day4;
import java.util.*;
/**
 * Created by nehagarg on 2/25/17.
 *
 * Write a program to demonstrate ArrayIndexOutOfBoundsException.

 */

        import java.util.Scanner;
public class ArrayExceptionMain {
    public static void main(String[] s)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            System.out.println("divison"+z);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("please provide correct argument");
        }
        catch(ArithmeticException e){
            System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
        }
        finally
        {
            System.out.println("It will executed");

        }
    }

}

