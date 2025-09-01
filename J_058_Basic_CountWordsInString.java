import java.util.Scanner;

public class J_058_Basic_CountWordsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence = scan.nextLine();

        String[] sentenceArray = sentence.split("\\s+");
        int count = 0;
        for (int i=0; i<sentenceArray.length; i++){ count++; }
        System.out.println("There were " + count + " number of words in the sentence.");
        scan.close();
    }
}
