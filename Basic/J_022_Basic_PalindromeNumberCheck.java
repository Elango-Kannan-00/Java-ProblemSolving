import java.util.Scanner;

public class J_022_Basic_PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int original = number;
        int reversed = 0;
        
        while (number > 0){ int digit = number % 10; reversed = reversed * 10 + digit; number /= 10; }
        if (original == reversed){ System.out.println("Yes, palindrome."); }
        else { System.out.println("No, palindrome."); }
        scan.close();
    }
}
