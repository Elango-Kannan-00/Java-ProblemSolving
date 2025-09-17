import java.util.Scanner;

public class J_029_Basic_PrintASCIIValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        int asciValue = (int) ch; 
        System.out.println(asciValue);
        scan.close();
    }
}
