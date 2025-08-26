import java.util.Scanner;

public class J_036_Basic_PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sumValue = 0;

        for (int i=1; i<number; i++){
            if (number % i == 0) { sumValue += i; }
        }

        if (sumValue == number) { System.out.println("Perfect Number."); }
        else { System.out.println("Not a perfect number."); }
        scan.close();
    }
}
