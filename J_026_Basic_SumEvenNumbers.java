import java.util.Scanner;

public class J_026_Basic_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sumValue = 0;

        for (int i=1; i<=n; i++){ if (i % 2 == 0){ sumValue += i; } }
        System.out.println(sumValue + " is the sum of value first " + n + "even numbers.");
        scan.close();
    }
}
