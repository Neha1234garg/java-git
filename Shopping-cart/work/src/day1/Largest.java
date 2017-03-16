package day1;

/**
 * Created by nehagarg on 2/25/17.
 Program to find the largest of 2 numbers
Author: Neha
Date : 14.02.2017
*/

import java.util.Scanner;
class Largest
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        int z=0;
        if(x>y)
            System.out.println("Largest = "+ x);
        else
            System.out.println("Largest = "+ y);
    }
}
