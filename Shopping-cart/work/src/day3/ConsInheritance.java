package day3;

/**
 * Created by nehagarg on 2/25/17.
 *
 * Write a program to understand constructor inheritance
 */
    class A2
    {
        /* A()
         {
             System.out.println("Super");
         }*/
        A2(int a)
        {
            System.out.println("Super: "+a);
        }
    }
    class B2 extends A2{
        B2(int a, int b)
        {
            super(a);
            System.out.println("Sub: "+b);
        }
    }
    public class ConsInheritance {
        public static void main(String [] args)
        {
            B2 ob = new B2(10,20);
        }
    }


