import java.util.Scanner;

public class J_044_Basic_CountPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];

        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        int posCount = 0, negCount = 0;
        for (int i=0; i<size; i++) { if (numArray[i] > 0){ posCount++; } else { negCount++; } }
        System.out.println("There were " + posCount + " positive and " + negCount + " negative numbers in the array.");
        scan.close();
    }
}
