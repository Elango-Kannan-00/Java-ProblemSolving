package Medium;

import java.util.Scanner;

public class J_105_Medium_FindSecondLargestInArray {

    public static int secondLargest(int[] n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (var num : n){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int count = scan.nextInt();

        int[] array = new int[count];
        for (int i=0; i<count; i++) {
            array[i] = scan.nextInt();
        }

        int result = secondLargest(array);
        if (result == Integer.MIN_VALUE) { System.out.println("There is no 2nd largest element."); }
        else System.out.println("2nd largest element is: " + result);
        scan.close();
    }
}
