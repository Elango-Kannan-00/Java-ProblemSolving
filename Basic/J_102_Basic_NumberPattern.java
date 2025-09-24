import java.util.Scanner;

public class J_102_Basic_NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int range = scan.nextInt();

        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range - i; j++) {
                System.out.print("  ");
            }
            int a = i;
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (i * 2) - 1) {
                    System.out.print(i + " ");
                } else if (k <= i) {
                    a++;
                    System.out.print(a + " ");
                } else {
                    a--;
                    System.out.print(a + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

// Enter number of rows: 5
//         1 
//       2 3 2 
//     3 4 5 4 3 
//   4 5 6 7 6 5 4 
// 5 6 7 8 9 8 7 6 5 