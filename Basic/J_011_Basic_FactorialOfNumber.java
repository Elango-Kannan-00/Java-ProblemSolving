import java.util.Scanner;

public class J_011_Basic_FactorialOfNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sumValue = 1;

        for(int i=num; i>0; i--){
            sumValue *= i;
        }

        System.out.println("The factorial is: " + sumValue);
        scan.close();
    }
}