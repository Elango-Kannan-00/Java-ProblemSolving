import java.util.Scanner;

public class J_024_Basic_SwapTwoNumbersTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        
        System.out.println("Before swap: " + a + " " + b);
        c = a; a = b; b = c;
        System.out.println("After swap: " + a + " " + b);
        scan.close();
    }
}
