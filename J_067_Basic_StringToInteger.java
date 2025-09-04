import java.util.Scanner;

public class J_067_Basic_StringToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        int number = Integer.parseInt(word);
        System.out.println(number);
        scan.close();
    }
}
