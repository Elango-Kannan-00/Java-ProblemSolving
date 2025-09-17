import java.util.Scanner;

public class J_086_Basic_HollowSquare{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = scan.nextInt();

        for (int i=1; i<=range; i++){
            for (int j=1; j<=range; j++){
                if (i == 1 || i == range) { System.out.print("*" + " "); }
                else if (j == 1 || j == range) { System.out.print("*" + " "); }
                else { System.out.print("  "); }
            }
            System.out.println();
        }
        scan.close();
    }
}