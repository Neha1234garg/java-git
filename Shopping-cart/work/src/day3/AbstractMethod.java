package day3;

/**
 * Created by nehagarg on 2/25/17.
 *
 * Write a program to understand abstract classes
 */
abstract class ab{
       abstract void fun();
        }
public class AbstractMethod {
    void fun(){
        System.out.println("Outside abstract class");
    }
    public static void main(String [] args){
        AbstractMethod ob=new AbstractMethod();
        ob.fun();

    }
}
