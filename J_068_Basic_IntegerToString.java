import java.util.Scanner;

public class J_068_Basic_IntegerToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scan.nextInt();

        String word = String.valueOf(number);
        System.out.println(word);
        scan.close();
    }
}
