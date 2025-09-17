import java.util.Scanner;

public class J_088_Basic_RightAlignedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range value: ");
        int range = scan.nextInt();

        for (int i=1; i<=range; i++){
            for (int j=1; j<=range - i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
