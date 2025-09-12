import java.util.Scanner;

public class J_089_Basic_PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print("  ");
            }
            int number = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

        scan.close();
    }
}

