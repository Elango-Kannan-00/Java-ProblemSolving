package Medium;

import java.util.Scanner;

public class J_108_Medium_ReverseNumberUsingMethod {
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scan.nextInt();

        System.out.println("The reversed number is: " + reverseNumber(number));
        scan.close();
    }
}
