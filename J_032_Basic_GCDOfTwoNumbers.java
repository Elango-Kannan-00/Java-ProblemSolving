import java.util.Scanner;

public class J_032_Basic_GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int one = scan.nextInt();

        System.out.print("Enter number two: ");
        int two = scan.nextInt();

        if (one > two){ 
            while (two > 0){
                int digit = one % two;
                one = two; two = digit;
            }
            System.out.println("The GCD is: " + one);
        }
        else {
             while (one > 0){
                int digit = two % one;
                two = one; one = digit;
             }
            System.out.println("The GCD is: " + two);
        }
        scan.close();
    }
}
