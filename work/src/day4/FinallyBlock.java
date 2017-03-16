package day4;

/**
 * Created by nehagarg on 2/18/17.
 * Write a program explaining use of finally
 */
public class FinallyBlock {
    public static void main(String[] args)
    {
        try{
            int a=10/0;
        }catch(NumberFormatException e){
            System.out.println(" type does not match");
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Finally always executes.");
        }
    }
}
