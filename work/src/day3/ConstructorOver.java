package day3;

/**
 * Created by nehagarg on 2/25/17.
 *
 * Write a program which explains constructor overloading
 */
public class ConstructorOver {
    int r_no;
    ConstructorOver(){
        r_no=10;
    }
    ConstructorOver(int a){
        this();
        r_no=r_no+a;
    }
    void get(int a)
    {
        r_no=a;
    }
    void display()
    {
        System.out.println(r_no);
    }
    public static void main(String [] args){
        ConstructorOver ob= new ConstructorOver(12);
        ob.display();
    }
}
