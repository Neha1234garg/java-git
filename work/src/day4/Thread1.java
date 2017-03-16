package day4;

/**
 * Write a program to print tables of 5 by creating a new thread and display 20 even
 numbers as a task of main thread.

 * Created by nehagarg on 2/25/17.
 */
class A extends Thread
{
    public void run()
    {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("I: "+i);
        }
    }

}

public class Thread1 {
    public static void main(String[] args)
    {
        A ob = new A();
        ob.start();

        B ob1 = new B();
        ob1.start();

    }
}

