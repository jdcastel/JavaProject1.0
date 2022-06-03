/********************************************** 
 * Workshop 1  
 * Course:JAC NEE - Semester 
 * Last Name: Rodriguez Castelblanco 
 * First Name:Juan David
 * ID:147891204
 * Section: NEE
 * This assignment represents my own work in accordance with Seneca Academic Policy. 
 * Signature 
 * Date:2022/05/29
 * **********************************************/ 
import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter numbers into array: ");
        double[][] a = new double[row][column];
        for (double[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = input.nextDouble();
            }
        }
        int[] largest = locateLargest(a);
        System.out.println("The location of the largest element is at: (" +  largest[0] + "," + largest[1] + ")");
        for (int i = 0; i < 2; i++) {
            System.out.print(largest[i]);
        }
    }

    public static int[] locateLargest(double[][] a) {
        double max = 0;
        int maxNumRow = 0;
        int maxNumColumn = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxNumRow = i;
                    maxNumColumn = j;
                }
            }
        }
        int[] largestNum = new int[2];
        largestNum[0] = maxNumRow;
        largestNum[1] = maxNumColumn;
        return largestNum;
    }
}