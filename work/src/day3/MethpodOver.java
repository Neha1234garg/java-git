package day3;

/**
 * Created by nehagarg on 2/25/17.
 * Write a program which explains method overriding
 */
class Abc{
    void fun(){
        System.out.println("Method super");
    }
}
public class MethpodOver extends Abc {
    void fun(){
        System.out.println("Method base");
    }
    public static void main(String [] args){
        Abc ob=new MethpodOver();
        ob.fun();
    }
}
