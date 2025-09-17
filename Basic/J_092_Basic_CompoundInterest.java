import java.util.Scanner;

public class J_092_Basic_CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = scan.nextDouble();

        System.out.print("Enter the Annual interest rate (in %): ");
        double rate = scan.nextDouble();
        rate = rate / 100;  

        System.out.print("Enter the number of times the interest should be compounded (e.g., 1=yearly, 4=quarterly, 12=monthly): ");
        int compoundValue = scan.nextInt();

        System.out.print("Enter the time period (in years): ");
        int time = scan.nextInt();

        // Formula: A = P * (1 + r/n)^(n*t)
        double amount = principal * Math.pow((1 + rate / compoundValue), compoundValue * time);
        double compoundInterest = amount - principal;

        System.out.printf("The compounded interest amount is: %.2f", compoundInterest);
        scan.close();
    }
}
