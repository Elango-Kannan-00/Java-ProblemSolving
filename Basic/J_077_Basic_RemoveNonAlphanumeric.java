import java.util.Scanner;

public class J_077_Basic_RemoveNonAlphanumeric {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()){
            if (Character.isDigit(ch) || Character.isAlphabetic(ch)){ sb.append(ch); }
        }
        System.out.println("The new string is: " + sb);
        scan.close();
    }
}
