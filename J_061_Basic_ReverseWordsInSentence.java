import java.util.Scanner;

public class J_061_Basic_ReverseWordsInSentence{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence = scan.nextLine();

        String[] sentenceArray = sentence.split("\\s+");
        System.out.println(sentenceArray.length);
        for (int i=sentenceArray.length; i>0; i--){
            System.out.print(sentenceArray[i-1] + " ");
        }
        scan.close();
    }
}