package day2; /**
 * Created by nehagarg on 2/15/17.
 */
import java.util.Scanner;
public class TwoDim {
    public static void main(String [] args) {
        //System.out.println("Enter the Size for Rows: ");
        Scanner sc = new Scanner(System.in);
       int arr[][]=new int[3][];

        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[3];
        System.out.println("Entered elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j< arr[i].length;j++) {
                //System.out.println("Entered elements are: " + arr[i][j]);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j>arr[i].length;i++) {
                System.out.println("Entered elements are: " + arr[i][j]);
                //arr[i] = sc.nextInt();
            }
        }

    }
}
