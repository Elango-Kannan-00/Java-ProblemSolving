import java.util.Scanner;

public class J_066_Basic_StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        int count = 0;
        char[]chars = word.toCharArray();
        for (char ch : chars){
            if (ch == ' ') continue;  else count++;
        }

        System.out.println("The length of the string is " + count);
        scan.close();
    }
}
