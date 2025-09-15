import java.util.Scanner;

public class J_094_Basic_SumOfCubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range value: ");
        int range = scan.nextInt();

        int sumValue = 0;
        for (int i=1; i<=range; i++) { sumValue += i * i * i; }
        System.out.println("The sum value of first " + range + " squares is: " + sumValue);
        scan.close();
    }
}
