package day1;

/**
 * Created by nehagarg on 2/25/17.
 Program to reverse a number
 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Word
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num=sc.nextInt();
        String arr[]={"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};

        int rev=0,num1=num;
        int rem,rem1=0;

        while(num1!=0)
        {
            rem = num1%10;
            rev = (rev*10) + rem;
            num1 = num1/10;
        }

        while(rev!=0)
        {
            rem1 = rev%10;
            //rev = (rev*10) + rem;

            System.out.println(arr[rem1]);
            rev=rev/10;
        }
    }
}
