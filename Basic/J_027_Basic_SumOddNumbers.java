import java.util.Scanner;

public class J_027_Basic_SumOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sumValue = 0;
        
        for (int i=1; i<=n; i++){ if (i % 2 != 0){ sumValue += i; } }
        System.out.println(sumValue + " is the sum of first " + n + " odd numbers.");
        scan.close();
    }
}
