import java.util.Scanner;

public class J_047_Basic_SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] numArray = new int[size];

        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : numArray){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) { System.out.println("No 2nd smallest number."); }
        else { System.out.println(secondSmallest + " is the 2nd smallest."); }
        scan.close();
    }
}
