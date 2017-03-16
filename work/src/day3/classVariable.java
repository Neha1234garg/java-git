package day3;

/**
 * Created by nehagarg on 2/25/17.
 */
public class classVariable {

    static int sal=10;
    String name;
    void display(String s){
        name=s;
        System.out.println("name= "+ name+"/nsalary= "+sal);
    }

        public static void main(String args[]) {
            classVariable ob1=new classVariable();
            classVariable ob2=new classVariable();
            ob1.display("Neha");
            ob2.display("Nitu");

    }



}
