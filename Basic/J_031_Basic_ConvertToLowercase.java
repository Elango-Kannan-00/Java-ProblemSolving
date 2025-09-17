import java.util.Scanner;

public class J_031_Basic_ConvertToLowercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word.toLowerCase());
        scan.close();
    }
}
