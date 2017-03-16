package day3;

/**
 * Created by nehagarg on 2/25/17.
 * Write a program to explore constructor with parameters
 */
public class ConstParameter {

    ConstParameter(){
            System.out.println("DEFAULT CONSTRUCTOR");
        }
    ConstParameter(String a,int b)
        {
            System.out.println("\n PARAMETERIESD CONSTRUCTOR");
            System.out.println(a + "\t" + b);
        }
        /* Constructor(int a,Integer b)
        {
            System.out.println(a + "\t" + Integer (b));
        }

        Constructor(Integer a,int b)
        {
            System.out.println(a + "\t" + b);
        }
    */
        public static void main(String [] args)
        {
            ConstParameter ob=new ConstParameter();
            ConstParameter ob2=new ConstParameter("neha",100);
            //Constructor ob3=new Constructor(10,100);
        }
    }


