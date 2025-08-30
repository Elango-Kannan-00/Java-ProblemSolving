import java.util.Scanner;

public class J_054_Basic_SumDiagonalMatrix {
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

        int diagonalSum = 0;
        for (int i=0; i<rows; i++){
            diagonalSum += matrixArray[i][i];
            if (i != rows-1-i) { diagonalSum += matrixArray[i][rows-1-i]; }
        }
        System.out.println("The sum value of the matrix is: " + diagonalSum);
        scan.close();
    }
}