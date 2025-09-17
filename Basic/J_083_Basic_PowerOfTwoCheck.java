import java.util.Scanner;

public class J_083_Basic_PowerOfTwoCheck{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();
        int a = number;
        
        if (number < 0) { System.out.println("Enter valid number."); }
        else {
            while (number % 2 == 0) {
                number /= 2;
            }
        }
        if (number == 1) { System.out.println(a + " is a power of 2."); }
        else { System.out.println("The isn't the power of 2."); }
        scan.close();
    }
}