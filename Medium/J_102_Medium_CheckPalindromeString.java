package Medium;

import java.util.Scanner;
public class J_102_Medium_CheckPalindromeString {

    public static boolean stringPalindrome(String word){
        for (int i=1; i<=word.length()/2; i++){
            if (word.charAt(i-1) != word.charAt(word.length()-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = scan.next();
        word = word.toLowerCase();
        boolean isPalindrome = stringPalindrome(word);

        System.out.println(isPalindrome ? "Yes, Palindrome." : "Not a Palindrome.");
    }
}
