package Medium;

import java.util.Scanner;

public class J_112_Medium_CountConsonantsUsingMethod {
    public static int consonantFinder(String w) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i=0; i<w.length(); i++) {
            if (!(vowels.indexOf(w.charAt(i)) != -1)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = scan.next();
        word = word.toLowerCase();

        System.out.println("The number of consonants in the word is: " + consonantFinder(word));
        scan.close();
    }
}
