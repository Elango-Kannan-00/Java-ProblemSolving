import java.util.Scanner;

public class J_078_Basic_FindLargestWordInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = scan.nextLine();

        String[] sentenceArray = sentence.split(" ");
        int length = 0;
        String word = "";
        for (String s : sentenceArray){
            s = s.replaceAll("[^a-zA-Z]", "");
            if (s.length() > length){ length = s.length(); word = s; }
        }
        System.out.println("The largest word in a sentence is: " + word);
        scan.close();
    }
}