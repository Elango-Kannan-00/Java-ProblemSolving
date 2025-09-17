import java.util.Scanner;

public class J_041_Basic_ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];
        int sumValue = 0;

        for (int i=0; i<size; i++){ numArray[i] = scan.nextInt(); }
        for (int i=0; i<size; i++){ sumValue += numArray[i]; }
        System.out.println("The sum of the array is: " + sumValue);
        System.out.println("The average of the array is: " + (sumValue/size));
        scan.close();
    }
}
