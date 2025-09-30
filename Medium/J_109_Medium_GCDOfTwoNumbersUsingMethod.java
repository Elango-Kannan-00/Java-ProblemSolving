package Medium;

import java.util.Scanner;

public class J_109_Medium_GCDOfTwoNumbersUsingMethod {
    public static int gcdFinder(int n1, int n2) {
        if (n1 > n2) {
            while (n2 > 0) {
                int digit = n1 % n2;
                n1 = n2;
                n2 = digit;
            }
            return n1;
        } else {
            while (n1 > 0) {
                int digit = n2 % n1;
                n2 = n1;
                n1 = digit;
            }
            return n2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        System.out.println("The GCD of given numbers is: " + gcdFinder(number1, number2));
    }
}