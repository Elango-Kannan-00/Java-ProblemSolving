import java.util.Scanner;

public class J_038_Basic_StarPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        int n = range;

        for (int i=1; i<=n; i++){
            for (int j=1; j<range; j++){
                System.out.print(" ");
            }
            for (int k=0; k<i; k++){
                System.out.print("*" + " ");
            }
            range--;
            System.out.println();
        }
        scan.close();
    }
}
