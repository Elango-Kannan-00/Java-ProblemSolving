import java.util.Scanner;

public class J_046_Basic_SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];

        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numArray){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) { System.out.println("No 2nd largest number."); }
        else { System.out.println(secondLargest + " is the 2nd largest."); }
        scan.close();
    }
}
