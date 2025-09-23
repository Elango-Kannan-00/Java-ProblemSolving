package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class J_103_Medium_MultiplyTwoMatrices {

    public static int[][] matrixMultiplication(int[][] m1, int[][] m2) {
        int rows1 = m1.length;
        int cols1 = m1[0].length;
        int cols2 = m2[0].length;

        int[][] multiMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                multiMatrix[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    multiMatrix[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return multiMatrix;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows in 1st matrix: ");
        int row1 = scan.nextInt();
        System.out.print("Enter number of columns in 1st matrix: ");
        int column1 = scan.nextInt();

        int[][] matrix1 = new int[row1][column1];
        System.out.println("Enter elements of 1st matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter number of rows in 2nd matrix: ");
        int row2 = scan.nextInt();
        System.out.print("Enter number of columns in 2nd matrix: ");
        int column2 = scan.nextInt();

        if (column1 != row2) {
            System.out.println("Matrix multiplication not possible! Column of first must equal row of second.");
            scan.close();
            return;
        }

        int[][] matrix2 = new int[row2][column2];
        System.out.println("Enter elements of 2nd matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }


        int[][] result = matrixMultiplication(matrix1, matrix2);

        System.out.println("First matrix: " + Arrays.deepToString(matrix1));
        System.out.println("Second matrix: " + Arrays.deepToString(matrix2));
        System.out.println("Multiplication result: " + Arrays.deepToString(result));

        scan.close();
    }
}