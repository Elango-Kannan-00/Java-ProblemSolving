import java.util.Scanner;

public class J_043_Basic_SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];

        for (int i=0; i<size; i++){ numArray[i] = scan.nextInt(); }

        int smallest = numArray[0];
        for (int i=0; i<size; i++){ 
            if (numArray[i] < smallest){ smallest = numArray[i]; }
        }
        System.out.println("The smallest element in the array is: " + smallest);
        scan.close();
    }
}
