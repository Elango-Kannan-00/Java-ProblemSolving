import java.util.Scanner;

public class J_075_Basic_PrintAllSubstrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence = scan.nextLine();

        String[] subStrings = sentence.split(" ");
        System.out.println("The substrings are: ");
        for (String sub : subStrings){
            System.out.println(sub);
        }
        scan.close();
    }
}
