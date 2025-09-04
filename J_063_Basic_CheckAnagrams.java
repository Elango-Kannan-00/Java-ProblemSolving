import java.util.Scanner;

public class J_063_Basic_CheckAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.nextLine();
        String originalWord1 = word1.toLowerCase();

        System.out.println("Enter second word: ");
        String word2 = scan.nextLine();
        String originalWord2 = word2.toLowerCase();

        if (word1.length() != word2.length()){ System.out.println("Not anagram"); }

        int[] count = new int[256];
        for (int i=0; i<originalWord1.length(); i++) {
            count[originalWord1.charAt(i)]++;
            count[originalWord2.charAt(i)]--;
        }
        
        boolean isAnagram = true;
        for (int i=0; i<count.length; i++){
            if (count[i] != 0) { isAnagram = false; break; }
        }
        
        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
        scan.close();
    }
}
