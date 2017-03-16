package day3;

/**
 * Created by nehagarg on 2/25/17.
 *
 * Write a program to access constructor of java
 */
public class Const {
    int a;
    Const(){System.out.println("Default constructor");}
    Const(int a){
        this.a=a;
    }
   void display(){
       System.out.println("Call to display");
    }
    public static void main(String [] args){
        Const ob1=new Const();
        Const ob2 = new Const(10);
        ob1.display();

    }
}
