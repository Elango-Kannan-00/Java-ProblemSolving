import java.util.Scanner;

public class J_045_Basic_CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];

        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        int eveCount = 0, oddCount = 0;
        for (int i=0; i<size; i++) { if (numArray[i] % 2 == 0) { eveCount++; } else { oddCount++; } }
        System.out.println("There were " + oddCount + " odd and " + eveCount + " even numbers in the array.");
        scan.close();
    }
}
