import java.util.Scanner;

public class J_015_Basic_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        
        StringBuilder sb = new StringBuilder();
        while (decimal > 0){
            int digit = decimal % 2;
            sb.append(digit);
            decimal /= 2;
        }

        String binary = sb.reverse().toString();
        System.out.println("Binary value of " + decimal + "is: " + binary);
        scan.close();

        // // or builtin method
        // String binary = Integer.toBinaryString(decimal);
        // System.out.println(binary);
    }
}
