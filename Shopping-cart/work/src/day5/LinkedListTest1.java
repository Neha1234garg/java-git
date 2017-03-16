package day5;
import java.util.LinkedList;
import java.util.Iterator;
/**
 * Created by nehagarg on 2/25/17.
 */
public class LinkedListTest1{
    public static void main(String[] args)
    {
        LinkedList<String> names=new LinkedList<String>();

        names.add("neha");
        names.add("nitu");
        names.add("raga");
        names.add("ritu");
        System.out.println(names);
        names.addFirst("rahul");
        names.add("vina");

        System.out.println(names);


        Iterator <String> it=names.iterator();
        while(it.hasNext())
        {
            String name=it.next();
            System.out.println(name+",");
        }
    }
}
