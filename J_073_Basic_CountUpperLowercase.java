import java.util.Scanner;

public class J_073_Basic_CountUpperLowercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        StringBuilder newWord = new StringBuilder();
        for (int i=0; i<word.length(); i++){ 
            if (Character.isLowerCase(word.charAt(i))) { newWord.append(Character.toUpperCase(word.charAt(i))); }
            else { newWord.append(Character.toLowerCase(word.charAt(i))); }
        }
        System.out.println("Updated string is: " + newWord);
        scan.close();
    }
}
