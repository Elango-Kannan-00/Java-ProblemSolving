import java.util.Scanner;

public class J_028_Basic_NumbersDivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        for (int i=1; i<=100; i++){ if (i % 3 == 0 && i % 5 == 0){ System.out.print(i + " "); } }
        scan.close();
    }
}
