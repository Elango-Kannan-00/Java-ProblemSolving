package Medium;

import java.util.Scanner;

public class J_101_Medium_FactorialUsingMethod {
    public static int factorial(int n){
        int productValue = 1;
        for (int i=n; i>0; i--) { productValue *= i; }
        return productValue;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();

        System.out.println("The factorial of a given number " + number + " is: " + factorial(number));
        scan.close();
    }
}
