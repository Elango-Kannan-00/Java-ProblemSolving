import java.util.Arrays;
import java.util.Scanner;

public class J_010_Basic_SortArrayAscending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numArray = new int[size];
        int swap;

        for (int i=0; i<size; i++){
            numArray[i] = scan.nextInt();
        }

        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-1; j++){
                if (numArray[j] > numArray[j+1]){
                    swap = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(numArray));
        scan.close();
    }
}