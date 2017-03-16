package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nehagarg on 2/18/17.
 * Write a program explaining inner try catch block
 */
public class InnerTryCatch {

    public static void main(String [] args)

    {
        Scanner sc = new Scanner(System.in);
        int result=0;

        try{
            System.out.println("Enter first element");
            int num1=sc.nextInt();
            System.out.println("Enter second element");
            int num2=sc.nextInt();
            if(num1>num2)
                try
                {
                    result = num1/num2;

                }catch(ArithmeticException e)
                {
                    System.out.println("Division by zero");
                }
            System.out.println("Result = "+result);
        }catch(InputMismatchException e)
        {
            System.out.println("plz provide integer values");
        }
        System.out.println("Execution completed");


    }
}
