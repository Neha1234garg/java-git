package day1;

/**
 * Created by nehagarg on 2/25/17.
 Display the following sequences
 1
 1 2
 1 2 3


 1 2 3 4 5 6 7 8 9

 Author: Neha
 Date : 14.02.2017
 */

import java.util.Scanner;
class Pattern1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.print("\n");
        }
    }
}
