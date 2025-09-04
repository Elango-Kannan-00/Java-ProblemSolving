import java.util.Scanner;

public class J_069_Basic_ConcatenateStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string one: ");
        String word1 = scan.nextLine();

        System.out.println("Enter second word: ");
        String word2 = scan.nextLine();

        String concateWord = word1.concat(word2);
        System.out.println(concateWord);
        scan.close();
    }
}
