import java.util.Scanner;

public class J_005_Basic_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        int first = 0, second = 1, next;

        for (int i=0; i<range; i++){
            System.out.println(first);
            next = first;
            first = second;
            second = next + second;
        }

        scan.close();
    }    
}
