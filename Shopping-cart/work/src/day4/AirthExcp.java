package day4;
import com.sun.deploy.util.ArrayUtil;
import java.util.Scanner;

/**
 * Created by nehagarg on 2/17/17.
 */
public class AirthExcp {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int result=0;
        System.out.println("Enter first element");
        int a=sc.nextInt();
        System.out.println("Enter second element");
        int b=sc.nextInt();

        try
        {
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Provide specific elements of an array");
        }*/
        System.out.println("Result = "+result);

    }

}
