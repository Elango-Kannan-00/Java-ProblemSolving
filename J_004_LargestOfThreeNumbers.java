import java.util.Scanner;

public class J_004_LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();

        if (one > two && one > three)
            System.out.println(one + " is Bigger.");
        else if (one == two && one == three)
            System.out.println("All are equal.");
        else if (two > one && two > three)
            System.out.println(two + " is Bigger.");
        else 
            System.out.println(three + " is Bigger.");

        scan.close();
    }
}
