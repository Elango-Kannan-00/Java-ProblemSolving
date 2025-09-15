import java.util.Scanner;

public class J_099_Basic_PowerUsingRecursion {
    static int power(int b, int p){
        if (p == 0) return 1;
        else return b * power(b, p - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scan.nextInt();

        System.out.print("Enter the power value: ");
        int power = scan.nextInt();
        System.out.println("The power of give number " + base + "raised to the power of " + power + " is " + power(base, power));
        scan.close();
    }
}
