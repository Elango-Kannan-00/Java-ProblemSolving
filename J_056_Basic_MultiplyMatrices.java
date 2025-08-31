import java.util.Arrays;
import java.util.Scanner;

public class J_056_Basic_MultiplyMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count of rows for matrix 1: ");
        int rows1 = scan.nextInt();
        System.out.print("Enter the count of columns for matrix 1: ");
        int columns1 = scan.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        System.out.println("Enter the elements of matrix 1:");
        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns1; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix 1 " + Arrays.deepToString(matrix1));

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
        System.out.println("Matrix 2 " + Arrays.deepToString(matrix2));

        // matrix multiplication
        int[][] multiMatrix = new int[rows1][columns1];
        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns1; j++){
                multiMatrix[i][j] = 0;
                for (int k=0; k<columns1; k++){
                    multiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Matrix after multiplication " + Arrays.deepToString(multiMatrix));
        scan.close();
    }    
}