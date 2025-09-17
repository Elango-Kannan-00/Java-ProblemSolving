import java.util.Scanner;

public class J_002_Basic_ArithmeticOperations{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int mod = a % b;
        int mult = a * b;
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + sub);
        System.out.println("The division is: " + div);
        System.out.println("The modulus is: " + mod);
        System.out.println("The multiplication is: " + mult);
        scan.close();
    }
}