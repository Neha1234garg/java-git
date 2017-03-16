package day5;

/**
 * Created by nehagarg on 2/25/17.
 */
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

class CustomEnumExample {

    public static void main(String[] args) {
        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to ArrayList
        arrayList.add("Bird");
        arrayList.add("Animal");
        arrayList.add("Raptiles");
        arrayList.add("Mammles");


        // Get the Enumeration object
        Enumeration<String> e = Collections.enumeration(arrayList);

        // Enumerate through the ArrayList elements
        System.out.println("ArrayList elements: ");
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
