package day2;

/**
 * Created by nehagarg on 2/25/17.
 */
public class Room {
    int len;
    int width;
    void get(int a,int b)
    {
        len=a;
        width=b;
    }
    void set(){

        System.out.println("Length= "+len);
        System.out.println("Width= "+width);
    }
    public static void main(String [] args){
        Room ob=new Room();
        ob.get(10,20);
        ob.set();
    }
}
