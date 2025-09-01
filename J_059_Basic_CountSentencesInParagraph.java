import java.util.Scanner;

public class J_059_Basic_CountSentencesInParagraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any paragraph: ");
        String paragraph = scan.nextLine();

        String[] sentenceArray = paragraph.split("[.!?]+");
        int count = 0;
        for (int i=0; i<sentenceArray.length; i++) { count++; }
        System.out.println("Ther weere " + count + " number of sentences in the given paragraph.");
        scan.close();
    }
}
