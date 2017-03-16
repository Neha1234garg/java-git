package day1;

/**
 * Created by nehagarg on 2/25/17.
 Program to display the multiplication table of a number
 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Table
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int a=x*i;
            System.out.println(x+"*"+i+"="+a);
        }
    }
}
