import java.util.Scanner;

public class J_079_Basic_ReverseEachWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence = scan.nextLine();

        String[] sentenceArray = sentence.split(" ");
        String[] reverseArray = new String[sentenceArray.length];
        for (int i=0; i<sentenceArray.length; i++){
            String word = sentenceArray[i];
            StringBuilder sb = new StringBuilder();
            for (int j=sentenceArray[i].length()-1; j>=0; j--){
                sb.append(word.charAt(j));
            }
            reverseArray[i] = sb.toString();
        }

        for (String s : reverseArray){ System.out.print(s + " "); }
        scan.close();
    }
}
