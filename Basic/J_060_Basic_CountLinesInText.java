import java.util.Scanner;

public class J_060_Basic_CountLinesInText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text (use ENTER for new lines, type 'exit' in a new line to finish):");

        int lineCount = 0;
        while (true) {
            String line = scan.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            lineCount++;
        }

        System.out.println("There were " + lineCount + " number of lines in the text.");
        scan.close();
    }
}
