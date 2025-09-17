import java.util.Scanner;

public class J_070_Basic_CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();

        int[] count = new int[256];
        for (int i=0; i<word.length(); i++) {
            count[word.charAt(i)]++;
        }

        for (int i=0; i<count.length; i++) {
            if (count[i] > 0) { System.out.println((char)i + "--> " + count[i] + " time(s)."); }
        }
        scan.close();

        // If we don't wanna include whitespaces
        // int[] count = new int[256];
        // for (int i=0; i<word.length(); i++) {
        //     if (word.charAt(i) != ' ') { count[word.charAt(i)]++; }
        // }
    }
}
