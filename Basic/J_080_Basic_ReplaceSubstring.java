import java.util.Scanner;

public class J_080_Basic_ReplaceSubstring {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence = scan.nextLine();

        System.out.println("Enter the subtring to be replaced: ");
        String replacedString = scan.nextLine();

        System.out.println("Enter the replacing sub-string: ");
        String replacingString = scan.nextLine();

        String[] sentenceArray = sentence.split(" ");
        for (int i=0; i<sentenceArray.length; i++){
            if (sentenceArray[i].equals(replacedString)){ sentenceArray[i] = replacingString; }
        }
        for (String s : sentenceArray){ System.out.print(s + " "); }
        scan.close();
    }
}
