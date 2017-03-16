package day5;

/**
 * Created by nehagarg on 2/25/17.
 */
import java.util.*;
class ArrayListColl{

    public static void main(String [] args){

        ArrayList<String> al= new ArrayList<String>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}