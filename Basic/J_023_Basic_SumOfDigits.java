import java.util.Scanner;

public class J_023_Basic_SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sumValue = 0;

        while (number > 0) { int digit = number % 10; sumValue += digit; number /= 10; }
        System.out.println("The sum of the digits is: " + sumValue);
        scan.close();
    }
}
