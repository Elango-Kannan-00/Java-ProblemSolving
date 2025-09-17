import java.util.Scanner;

public class J_065_Basic_RemoveSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) == ' '){ continue; }
            else {
                System.out.print(word.charAt(i));
            }
        }
        scan.close();

        // Other methods
        // Using same logic
        // for (int i=0; i<word.length(); i++){
        //     if (word.charAt(i) != ' '){
        //         System.out.print(word.charAt(i));
        //     }
        // }

        // Using string builder
        // StringBuilder sb = new StringBuilder();
        // for (int i=0; i<word.length(); i++){
        //     if (word.charAt(i) != ' ') { sb.append(word.charAt(i)); }
        // }

        // Using built-in methods(Oneliner)
        // System.out.println(word.replace(" ", "")); 
        // or
        // System.out.println(word.replace("\\s+", ""));
    }
}
