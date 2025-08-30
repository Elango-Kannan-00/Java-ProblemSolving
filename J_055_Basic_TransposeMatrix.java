import java.util.Scanner;
import java.util.Arrays;

public class J_055_Basic_TransposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter the count of columns: ");
        int columns = scan.nextInt();

        int[][] matrixArray = new int[rows][columns];
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matrixArray[i][j] = scan.nextInt();
            }
        }

        System.out.println("Original matrix: " + Arrays.deepToString(matrixArray));
        int[][] transposeMatrix = new int[columns][rows];
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                transposeMatrix[j][i] = matrixArray[i][j];
            }
        }

        System.out.println("Ttranspose matrix: "+ Arrays.deepToString(transposeMatrix));
        scan.close();
    }
}
