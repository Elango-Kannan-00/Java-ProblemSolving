package Medium;

import java.util.Scanner;

public class J_111_Medium_CountVowelsUsingMethod {
    public static int vowelFinder(String w) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i=0; i<w.length(); i++) {
            if (vowels.indexOf(w.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide any word: ");
        String word = scan.next();
        word = word.toLowerCase();
        
        System.out.println("The number of vowels in the word is: " + vowelFinder(word));
        scan.close();
    }
}
