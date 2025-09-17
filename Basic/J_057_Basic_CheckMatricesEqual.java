import java.util.Arrays;
import java.util.Scanner;

public class J_057_Basic_CheckMatricesEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count of row for matrix 1: ");
        int rows1 = scan.nextInt();
        System.out.print("Enter the count of columns for matrix 2: ");
        int columns1 = scan.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns1; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter the count of rows for matrix 2: ");
        int rows2 = scan.nextInt();
        System.out.print("Enter the count of columns for matrix 2: ");
        int columns2 = scan.nextInt();

        int[][] matrix2 = new int[rows2][columns2];
        for (int i=0; i<rows2; i++){
            for (int j=0; j<columns2; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix 1: " + Arrays.deepToString(matrix1));
        System.out.println("Matrix 2: " + Arrays.deepToString(matrix2));
        boolean isSame = true;
        if (!(rows1 == rows2 && columns1 == columns2)) { System.out.println("The above two matrices are not eqaul."); }
        else {
            for (int i=0; i<rows1; i++){
                for (int j=0; j<columns1; j++){
                    if (matrix1[i][j] != matrix2[i][j]) { isSame = false; break; }
                }
            }
        }
        System.out.println(isSame ? "The 2 matrices are equal." : "The 2 matrices are not equal.");
        scan.close();
    }
}
