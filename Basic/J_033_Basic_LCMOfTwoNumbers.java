import java.util.Scanner;

public class J_033_Basic_LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int one = scan.nextInt();
        int originalOne = one;

        System.out.print("Enter number two: ");
        int two = scan.nextInt();
        int originalTwo = two;
        
        if (one > two){ 
            while (two > 0){
                int digit = one % two;
                one = two; two = digit;
            }
            int lcm = (originalOne * originalTwo)/one;
            System.out.println("LCM is: " + lcm);
        }
        else {
             while (one > 0){
                int digit = two % one; 
                two = one; one = digit;
            }
            int lcm = (originalOne * originalTwo)/two;
            System.out.println("LCM is: " + lcm);
        }
        scan.close();
    }
}
