package day1;

/**
 * Created by nehagarg on 2/25/17.
 Program to display the odd numbers between x & y
 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Odd
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        for(int i=x;i<=y;i++)
        {
            if(i%2==1)
                System.out.println("Odd numbers = "+i);
        }
    }
}