import java.util.Scanner;

public class J_085_Basic_SumFirstNEvenNumbers {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range value: ");
        int range = scan.nextInt();
        // int sumValue = 0, count = 0, a = 1;

        // if (range < 0) { System.out.println("Please enter valid range."); }
        // else {
        //     while (count < range) {  if (a % 2 == 0) { sumValue += a; count++; } a++;  }
        // }
        // System.out.println("The sum of first " + range + " odd numbers is: " + sumValue);
        // scan.close();

        // other methods using formulas.
        // For finding the sum of first n odd numbers.
        System.out.println("The sum of first " + range + " odd numbers is: " + (range * range));

        // For finding the sum of first n even nmumbers.
        System.out.println("The sum of forst " + range + " even numbers is: " + (range*(range + 1)));
    }
}
