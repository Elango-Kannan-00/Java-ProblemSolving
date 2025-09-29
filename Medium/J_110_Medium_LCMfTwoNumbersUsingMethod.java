package Medium;
import java.util.Scanner;

public class J_110_Medium_LCMfTwoNumbersUsingMethod {
    public static int lcmCalculation(int n1, int n2) {
        int a = n1, b = n2;
        if (n1 > n2) {
            while (n2 > 0) {
                int digit = n1 % n2;
                n1 = n2;
                n2 = digit;
            }
            int lcm = (a * b) / n1;
            return lcm;
        } else {
            while (n1 > 0) {
                int digit = n2 % n1;
                n2 = n1;
                n1 = digit;
            }
            int lcm = (a * b) / n2;
            return lcm;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        System.out.println("LCM of two numbers is: " + lcmCalculation(number1, number2));
        scan.close();
    }    
}
