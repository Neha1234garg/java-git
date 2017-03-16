package day4;

/**
 Write a program to define a queue interface and have insert and delete methods in the interface. Implement these methods in a class. /**
 * Created by nehagarg on 2/16/17.
 */
import java.util.Scanner;
interface Queue1
{
    void insert();
    void delete();
}
public class Queue implements Queue1 {
    int front=0,rear=0,n=5;
    int a[]=new int[n];
    public void insert() {
        if (rear + 1 >= n)
        {

            System.out.println("OVERFLOW");
            //break;
        }else
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter element to insert");
                int item = sc.nextInt();
                rear++;
                a[rear] = item;
                System.out.println("item inserted"+a[rear]);

        }
    }

    public void delete()
    {
        if (front == rear) {

            System.out.println("UNDERFLOW");
        }
        else
        {
            Scanner sc = new Scanner(System.in);

            //deletion will perfome from front only

            front++;
            int item=a[front];
            System.out.println("item deleted"+item);
        }

    }

    public static void main(String[] args) {

        int choice;
        int i, temp;

        Queue ob = new Queue();

        Scanner sc = new Scanner(System.in);
        System.out.println("Select your choice:-\n");
        System.out.println("1. Insert\n");
        System.out.println("2. DELETE\n");

        choice = sc.nextInt();
        if (choice == 1){
            ob.insert();
        }
        else{
            ob.delete();

        }

    }
}
