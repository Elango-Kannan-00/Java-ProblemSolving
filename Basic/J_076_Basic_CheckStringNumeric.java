import java.util.Scanner;

public class J_076_Basic_CheckStringNumeric{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = scan.nextLine();

        boolean isNumber = true;
        for (char ch : word.toCharArray()){
            if (!Character.isDigit(ch)){ isNumber = false; break; }
        }

        System.out.println(isNumber ? "The string contains only numbers." : "The string doesn't contains only numbers.");
        scan.close();
    }
}
