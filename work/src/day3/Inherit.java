package day3;

/**
 * Created by nehagarg on 2/25/17.
 * Write a program which explains class inheritance
 */
class A{
   public int a=10;             //Super class
}
class B extends A{
    int b=20;                    //Sub class
    void display(){
        System.out.print("a= "+a+"\nb= "+b);
    }
}
 class Inherit {
     public static void main(String [] args) {
         B ob = new B();
         ob.display();
     }
}
