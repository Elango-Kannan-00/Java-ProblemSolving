import java.util.Scanner;

public class J_053_Basic_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();

        int[] numArray = new int[size];
        for (int i = 0; i < size; i++) {
            numArray[i] = scan.nextInt();
        }

        int[] uniqueArray = new int[size];
        boolean[] freqArray = new boolean[size];
        int uniqueIndex = 0;
        for (int i = 0; i < size; i++) {
            if (freqArray[i])
                continue;
            for (int j = i + 1; j < size; j++) {
                if (numArray[i] == numArray[j]) {
                    freqArray[j] = true;
                }
            }
            uniqueArray[uniqueIndex++] = numArray[i];
        }
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        scan.close();
    }
}