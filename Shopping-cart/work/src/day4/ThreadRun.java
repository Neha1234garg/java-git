package day4;

/**
 * Created by nehagarg on 2/25/17.
 */
public class ThreadRun implements  Runnable{
        public void run()
        {
            Thread t=Thread.currentThread();
            System.out.println(t);
        }

    }


 class RunThreadMain {
    public static void main(String[] args)
    {
        ThreadRun rt=new ThreadRun();
        rt.run();

    }

}