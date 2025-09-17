import java.util.Scanner;

public class J_081_Basic_PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();

        if (number < 0) { System.out.println("Negative can't be perfect square."); }
        else {
            int rootValue = (int) Math.sqrt(number);
            if (rootValue * rootValue == number) { System.out.println("Yes, Perfect square."); }
            else { System.out.println("Not a perfect square."); }
        }
        scan.close();
    }
}
