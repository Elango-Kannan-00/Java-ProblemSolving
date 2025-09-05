import java.util.Scanner;

public class J_073_Basic_CountUpperLowercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        int lower = 0, upper = 0;
        for (int i=0; i<word.length(); i++) { 
            if (word.charAt(i) != ' '){ 
                if (Character.isUpperCase(word.charAt(i))) { upper++; }
                else { lower++; }
            }
        }
        System.out.println("Number of upper and lower case characters are " + upper + " and " + lower + " respectively.");
        scan.close();

        // Converting lower to uppercase and upper to lowercase characters.
        // StringBuilder newWord = new StringBuilder();
        // for (int i=0; i<word.length(); i++){ 
        //     if (Character.isLowerCase(word.charAt(i))) { newWord.append(Character.toUpperCase(word.charAt(i))); }
        //     else { newWord.append(Character.toLowerCase(word.charAt(i))); }
        // }
        // System.out.println("Updated string is: " + newWord);
    }
}
