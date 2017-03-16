

//Write a program which explains ArrayList in java

package day5;
import java.util.ArrayList;

class ArrayList1<S> {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<String>();
        System.out.println(al+"\tSize=" +al.size());

        al.add("Esha");
        al.add("suraj");
        al.add("Dummy");

        for(String n: al){
            System.out.println(n);
        }

    }
}