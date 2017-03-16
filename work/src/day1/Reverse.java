package day1;

/**
 * Created by nehagarg on 2/25/17.
 Program to reverse a number
 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Reverse
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        int rev=0;
        int rem;
        //num=num1;
        while(num1!=0)
        {
            rem = num1%10;
            rev = (rev*10) + rem;
            num1=num1/10;
        }
        System.out.println(rev);
    }
}
