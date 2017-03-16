package day2;

/**
 * Created by nehagarg on 2/25/17.
 */
public class ReturnFun {
    void fun1(){
        System.out.print("No parameter");
    }
    int fun2(int a){
        return a;
    }
    float fun3(float a){
        return a;
    }
    public static void main(String [] args){
        ReturnFun ob = new ReturnFun();
        ob.fun1();
        ob.fun2(10);
        ob.fun3(12.34f);
    }
}
