import java.util.Scanner;

public class J_042_Basic_LargestElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] numArray  = new int[size];
        
        for (int i=0; i<size; i++){ numArray[i] = scan.nextInt(); }
        
        int largest = numArray[0];
        for (int i=0; i<size; i++){
            if (numArray[i] > largest){ largest = numArray[i]; }
        }
        System.out.println("The largest element in the array is: " + largest);
        scan.close();
    }
}
