import java.util.Scanner;

public class J_071_Basic_PrintUniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String originalWord = scan.nextLine();
        String word = originalWord.toLowerCase();

        int[] count = new int[256];
        for (int i=0; i<word.length(); i++){ if(word.charAt(i) != ' ' ) count[word.charAt(i)]++; }
        for (int i=0; i<count.length; i++){ if (count[i] == 1) System.out.print((char)i + " "); }
        scan.close();
    }
}
