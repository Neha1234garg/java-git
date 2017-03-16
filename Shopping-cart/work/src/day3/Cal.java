package day3;
 /**
     * Write a program to define functions for subtract, multiply, divide, factorial and reversing the digits of a number
     * in a package, import this class in another package and use all the methods defined in the primary package.



     * Created by nehagarg on 2/17/17.
     */

    public class Cal{
        //public int pub_a=10;
        //protected int pro_a=10;
        //int a=30;
        public void sub(){}
        public void div(){}
        public void fact(int number){ int i,fact=1;
            //int number=5;//It is the number to calculate factorial
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
        public void reverse(){}
    }
