import java.util.Scanner;

public class J_091_Basic_CheckPalindromeWithoutReversing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String originalWord = scan.nextLine();
        String word = originalWord.toLowerCase();

        boolean palindrome = true;
        for (int i=1; i<=word.length()-1; i++){
            if (!(word.charAt(i-1) == word.charAt(word.length()-i))) { palindrome = false; }
        }
        System.out.println(palindrome ? "Yes, Palindrome." : "Not a Palindrome.");
        scan.close();
    }
}
