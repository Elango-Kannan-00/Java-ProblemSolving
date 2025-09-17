import java.util.Scanner;

public class J_018_Basic_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tableNumber = scan.nextInt();

        for (int i=1; i<=10; i++) { System.out.println(tableNumber + " x " + i + " = " + (i*tableNumber)); }
        scan.close();
    }
}
