import java.util.Scanner;

public class J_016_Basic_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char dupCh = scan.next().charAt(0);
        String vowels = "aeiouAEIOU";
        char ch = Character.toLowerCase(dupCh);

        if (vowels.indexOf(ch) != -1) { System.out.println("Vowel");}
        else { System.out.println("Consonant"); }
        scan.close();
    }
}
