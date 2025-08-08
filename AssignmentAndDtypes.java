import java.util.Scanner;

public class AssignmentAndDtypes {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Integer: " + a);
        
        long b = 12345678L;
        System.out.println("Long: " + b);

        float c = 1234.567f;
        System.out.println("Float: " + c);

        Double d = 12345678.345678;
        System.out.println("Double: " + d);

        boolean e = true;
        System.out.println("Boolean: " + e);

        char f = 'a';
        System.out.println("Character: " + f);

        String g = "Elango Kannan";
        System.out.println("String: " + g);

        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        System.out.println(h);

        scan.nextLine();
        String i = scan.nextLine();
        System.out.println(i);

        scan.close();
    }
}


// Output
// Integer: 10
// Long: 12345678
// Float: 1234.567
// Double: 1.2345678345678E7
// Boolean: true
// Character: a
// String: Elango Kannan
// 2
// 2
// Kannan
// Kannan
