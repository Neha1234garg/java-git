package day1;

/**
 * Created by nehagarg on 2/25/17.
 Program to reverse a number
 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Pattern
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
