import java.util.Scanner;

public class J_019_Basic_ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int reversed = 0;
        if (number <= 0) { System.out.println("Please enter valid number."); }
        else {
            while (number > 0) { int digit = number % 10; reversed = reversed * 10 + digit; number /= 10;  }
            System.out.println(reversed);
        }

        // StringBuilder reversed = new StringBuilder();
        // while (number > 0) { int digit = number % 10; reversed.append(digit); number /= 10; }
        // System.out.println(reversed);

        // or using builtin function.
        // String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
        // System.out.println(reversed);
        scan.close();
    }
}   
