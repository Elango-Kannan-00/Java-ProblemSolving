package Medium;

import java.util.Scanner;
import java.util.Arrays;

public class J_114_Medium_BubbleSortArray {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scan.nextInt();

        int[] numArray = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numArray[i] = scan.nextInt();
        }

        int[] result = bubbleSort(numArray);
        System.out.println("Sorted array (Bubble sort): " + Arrays.toString(result));
        scan.close();
    }
}
