package day1;

/**
 * Created by nehagarg on 2/25/17.
 /*Program to find the largest of 3 numbers
 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Fibo
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        int ptr=0,save=0,bla=0,bla1=0;
        System.out.println(ptr);
        for(int i=0;i<x;i++)
        {
            save=ptr;
            bla=save;

            bla1=save+bla;
            System.out.println(" " + bla1);
            ptr++;



        }
    }
}