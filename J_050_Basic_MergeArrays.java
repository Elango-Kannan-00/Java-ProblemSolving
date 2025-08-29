import java.util.Arrays;
import java.util.Scanner;

public class J_050_Basic_MergeArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the size of 2nd array: ");
        int size2 = scan.nextInt();

        int[] numArray = new int[size];
        System.out.println("Enter elements of 1st array:");
        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        int[] numArray2 = new int[size2];
        System.out.println("Enter elements of 2nd array:");
        for (int i=0; i<size2; i++) { numArray2[i] = scan.nextInt(); }

        System.out.println("1st array: " + Arrays.toString(numArray));
        System.out.println("2nd array: " + Arrays.toString(numArray2));
        int[] numArray3 = new int[numArray.length + numArray2.length];
  
        System.out.println("Initial merged array: " + Arrays.toString(numArray3));
        for (int i=0; i<numArray.length; i++) { numArray3[i] = numArray[i]; }
        for (int i=0; i<numArray2.length; i++) { numArray3[i + numArray.length] = numArray2[i]; }

        System.out.println("Merged array: " + Arrays.toString(numArray3));
        scan.close();
    }
}
