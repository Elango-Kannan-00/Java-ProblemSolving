package Medium;

import java.util.Scanner;

public class J_113_Medium_CheckAnagramsUsingMethod {

    public static boolean anagramChecker(String w1, String w2) {
        int[] count = new int[256];
        for (int i=0; i<w1.length(); i++) {
            count[w1.charAt(i)]++;
            count[w2.charAt(i)]--;
        }

        for (int i=0; i<256; i++) {
            if (count[i] != 0) { 
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scan.next();
        word1 = word1.toLowerCase();

        System.out.print("Enter second word: ");
        String word2 = scan.next();
        word2 = word2.toLowerCase();

        boolean isAnagram = anagramChecker(word1, word2);
        System.out.println(isAnagram ? "Yes, Anagram." : "Not an Aanagram.");
        scan.close();
    }    
}
