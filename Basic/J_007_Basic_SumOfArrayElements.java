import java.util.Scanner;

public class J_007_Basic_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numArray = new int[size];
        int sumValue = 0;

        for (int i=0; i<size; i++){
            numArray[i] = scan.nextInt();
        }

        for (int i=0; i<size; i++){
            sumValue += numArray[i];
        }

        System.out.println("Sum of array elements is: " + sumValue);

        scan.close();
    }
}
