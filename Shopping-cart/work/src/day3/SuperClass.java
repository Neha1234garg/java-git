package day3;

/**
 * Write a program to understand super class
 * Created by nehagarg on 2/25/17.
 */
class A1{
    public int a=10;
}
class B1 extends A1{
    int b=20;                    //Sub class
    void display(){
        System.out.print("a= "+a+"\nb= "+b);
    }
        }
public class SuperClass {
    public static void main(String [] args) {
        B ob = new B();
        ob.display();
    }

}
