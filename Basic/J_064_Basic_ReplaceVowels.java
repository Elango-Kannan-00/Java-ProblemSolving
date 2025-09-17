import java.util.Scanner;

public class J_064_Basic_ReplaceVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = scan.nextLine();

        System.out.println("Enter the replacing character: ");
        char ch = scan.next().charAt(0);

        String vowels = "aeiouAEIOU";
        char[] newWord = new char[word.length()];

        for (int i=0; i<word.length(); i++){
            if (vowels.indexOf(word.charAt(i)) != -1){
                newWord[i] = ch;
            }
            else {
                newWord[i] = word.charAt(i);
            }
        }

        for (char c : newWord){ System.out.print(c); }
        scan.close();
    }
}