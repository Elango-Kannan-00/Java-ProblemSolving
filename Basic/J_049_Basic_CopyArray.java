import java.util.Scanner;
import java.util.Arrays;

public class J_049_Basic_CopyArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] numArray = new int[size];
        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        // logical way
        int[] numArray2 = new int[numArray.length];
        for (int i=0; i<numArray.length; i++) { numArray2[i] = numArray[i]; }
        System.out.println("Original array:" + Arrays.toString(numArray));
        System.out.println("Copy array:" + Arrays.toString(numArray2));

        // another way
        // numArray2 = numArray;
        // System.out.println("Copy array:" + Arrays.toString(numArray2));
        scan.close();
    }    
}
