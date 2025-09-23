package Medium;

import java.util.Scanner;

public class J_104_Medium_CountWordsInParagraph {

    public static int countWordInParagraph(String p){
        String[] countArray = p.split(" ");
        return countArray.length;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any paragraph: ");
        String paragraph = scan.nextLine();

        int count = countWordInParagraph(paragraph);
        System.out.println("The number of words in the paragraph is: " + count);
        scan.close();
    }
}
