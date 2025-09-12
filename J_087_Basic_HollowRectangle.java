import java.util.Scanner;

public class J_087_Basic_HollowRectangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length value: ");
        int length = scan.nextInt();

        System.out.println("Enter the breadth value: ");
        int breadth = scan.nextInt();

        for (int i=1; i<=breadth; i++){
            for (int j=1; j<=length; j++){
                if (i == 1 || i == breadth) { System.out.print("*" + " "); }
                else if (j == 1 || j == length) { System.out.print("*" + " "); }
                else { System.out.print("  "); }
            }
            System.out.println();
        }
        scan.close();
    }
}