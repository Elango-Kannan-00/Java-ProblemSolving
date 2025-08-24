import java.util.Scanner;

public class J_017_Basic_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();

        if (one < two && one < three) { System.out.println(one + " is smaller."); }
        else if (two < one && two < three) { System.out.println(two + " is smaller."); }
        else if (one == two && two == three) { System.out.println("All are same."); }
        else { System.out.println(three + " is smaller."); }
        scan.close();
    }
}
