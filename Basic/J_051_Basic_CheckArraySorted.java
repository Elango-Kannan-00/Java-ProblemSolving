import java.util.Scanner;

public class J_051_Basic_CheckArraySorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] numArray = new int[size];
        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        boolean isNot = true;
        for (int i=0; i<size-1; i++) { if (!(numArray[i+1] > numArray[i])){ isNot = false; break; } }
        System.out.println(isNot ? "Array is sorted." : "Array is not sorted.");
        
        scan.close();
    }
}
