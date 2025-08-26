import java.util.Scanner;

public class J_030_Basic_ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word.toUpperCase());
        scan.close();
    }
}
