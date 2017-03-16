package day1;

/**
 * Created by nehagarg on 2/25/17.
Program to display first 20 even numbers
Author: Neha
Date : 14.02.2017
*/

import java.util.Scanner;
class Even
{
    public static void main(String [] args)
    {
        //Scanner sc=new Scanner(System.in);
        int count=0;
        int x=1;
        //System.out.println("Enter first number");
        while(count<=20)
        {
            if(x%2==0)
            {
                System.out.println(x);
                count++;
            }
            x++;

        }
    }
}
