package day4;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * Created by nehagarg on 2/18/17.
 */

class StackTest {

    Scanner sc = new Scanner(System.in);
    int []arr1 = new int[10];
    int top = 0;


    int push(int max) {
        int max_top = 0, value = 0;

        //arr1[] = arr;
        value = sc.nextInt();
        max_top=max;
        try {
            if(top == max_top)
                System.out.println("OVERFLOW");
        }
        catch (Exception e){
            System.out.println("OVERFLOWWWWWWWWWW");

        }
       // while (top < max_top) {
        top++;
            arr1[top] = value;

            System.out.println("element pushed");

        //}
        return arr1[top];
    }

    int pop(int max) {
        int max_top=0;
        max_top=max;

        try{
            if(top == 0)
                System.out.println("UNDERFLOW");
        }
        catch(EmptyStackException e)
        {
            System.out.println("UNDERFLOWWWWWWW");
        }


       // while (top != 0) {
    if(top < max_top)
    {
    arr1[top - 1] = arr1[top];
    System.out.println("element poped is: ");
    top--;
    System.out.println("top = " + top);
    }
        return arr1[top];


        }
    }

public class Stack1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=5;
       // int arr[]=new int[max];

        StackTest ob = new StackTest();
        int a= ob.push(max);
        System.out.println(a);



        int b=ob.pop(max);
        System.out.println(b);

        int c=ob.pop(max);
        System.out.println(c);

       /* int c= ob.push(max);
        System.out.println(c);*/

    }
}


