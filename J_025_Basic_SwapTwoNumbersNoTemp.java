import java.util.Scanner;

public class J_025_Basic_SwapTwoNumbersNoTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println("Before swap: " + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: " + a + " " + b);
        scan.close();
    }
}
