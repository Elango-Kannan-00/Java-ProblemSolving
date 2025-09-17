import java.util.Scanner;

public class J_034_Basic_ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalNumber = number, originalNumber2 = number, count = 0, sumValue = 0;

        while (number > 0){ 
            int digit = number % 10; 
            count++;
            number /= 10;
        }

        while (originalNumber > 0){
            int digit = originalNumber % 10;
            sumValue += Math.pow(digit, count);
            originalNumber /= 10;
        }

        if (originalNumber2 == sumValue) { System.out.println("Armstrong number."); }
        else { System.out.println("Not an Armstrong number."); }
        scan.close();
    }
}
