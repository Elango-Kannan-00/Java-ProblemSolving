import java.util.Scanner;

public class J_097_Basic_FactorialUsingRecursion {
    static int factorial(int number){
        if (number == 0) { return 1; }
        else { return number * factorial(number-1); }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scan.nextInt();
       System.out.println("Factorial of " + number + " is " + factorial(number));
        scan.close();
    }
}
