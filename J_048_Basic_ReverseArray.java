import java.util.Arrays;
import java.util.Scanner;

public class J_048_Basic_ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];

        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }
        for (int i=0; i<size/2; i++) { int temp = numArray[i]; numArray[i] = numArray[size-1-i]; numArray[size-1-i] = temp; }
        System.out.println(Arrays.toString(numArray));
        scan.close();
    }
}
