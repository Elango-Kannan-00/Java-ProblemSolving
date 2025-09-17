import java.util.Scanner;

public class J_090_Basic_CountVowelsInEachWord{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence = scan.nextLine();

        String[] sentenceArray = sentence.split(" ");
        String vowels = "aeiouAEIOU";

        for (int i=0; i<sentenceArray.length; i++){
            String word = sentenceArray[i];
            int count = 0;
            for (int j=0; j<word.length(); j++){
                if (vowels.indexOf(word.charAt(j)) >= 0) { count++; }
            }
            System.out.println(sentenceArray[i] + " has " + count + " vowel(s).");
        }
        scan.close();
    }
}