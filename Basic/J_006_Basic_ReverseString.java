import java.util.Scanner;

public class J_006_Basic_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        for (int i = string.length()-1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }

        scan.close();
    }
}
