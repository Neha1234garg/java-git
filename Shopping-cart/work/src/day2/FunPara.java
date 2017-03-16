package day2;

/**
 * Created by nehagarg on 2/25/17.
 */
public class FunPara {
    void onePara(int a)
    {
        System.out.print("One Parameter: "+ a);
    }
    void twoPara(int a,int b)
    {
        System.out.print("First Parameter: "+ a);
        System.out.print("Second Parameter: "+ b);
    }
    public static void main(String [] args){
        FunPara ob = new FunPara();
        ob.onePara(10);
        ob.twoPara(10,20);
    }
}
