import java.util.Scanner;

public class J_020_Basic_CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int count = 0;
        if (number <= 0){ System.out.println("Please enter a valid number."); }
        else {
            while (number > 0){
                int digit = number % 10;
                count++;
                number /= 10;
            }
        }
        System.out.println("The given number has " + count + " digits.");
        scan.close();
    }
}
