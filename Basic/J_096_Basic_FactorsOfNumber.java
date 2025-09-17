import java.util.Scanner;

public class J_096_Basic_FactorsOfNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();

        if (number < 0) { System.out.println("Number cannot be a zero."); }
        else {
            for (int i=1; i<=number; i++) { if (number % i == 0) { System.out.print(i + " "); } }
        }
        scan.close();
    }
}

