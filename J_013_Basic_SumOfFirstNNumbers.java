import java.util.Scanner;

public class J_013_Basic_SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        int sumValue = 0;

        if (range == 0 || range < 0){ System.out.println("Range is Inavlid."); }
        else{
            for (int i=1; i<=range; i++){
                sumValue += i;
            }
        }
        System.out.println("Sum of first " + range + "natural number is: " + sumValue);
        scan.close();
    }
}
