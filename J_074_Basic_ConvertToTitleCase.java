import java.util.Scanner;

public class J_074_Basic_ConvertToTitleCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        StringBuilder newWord = new StringBuilder();
        for (int i=0; i<word.length(); i++) { 
            if (i == 0){ 
                if (Character.isLowerCase(word.charAt(i))){ 
                    newWord.append(Character.toUpperCase(word.charAt(i))); 
                }
            }
            else { newWord.append(word.charAt(i)); }
        }
        System.out.println("The titled word is: " + newWord);
        scan.close();
    }
}
