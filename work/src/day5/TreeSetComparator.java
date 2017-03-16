package day5;
import java.util.TreeSet;
import java.util.Comparator;
/**
 * Created by nehagarg on 2/25/17.
 */
public class TreeSetComparator {


    public static void main(String[] args) throws InterruptedException {

        TreeSet<Integer> ts=new TreeSet<>(new MyComparator());
        ts.add(12);
        ts.add(23);
        ts.add(45);
        System.out.println(ts);
//to store data in descnding order
    }
}
class MyComparator implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        System.out.println(o1+" "+o2);

        if(o1<o2)
            return 1;
        else if(o1>o2)
            return -1;
        else
            return 0;

    }

}

