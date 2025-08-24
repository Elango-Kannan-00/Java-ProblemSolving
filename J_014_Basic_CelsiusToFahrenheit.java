import java.util.Scanner;

public class J_014_Basic_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter celcius: ");
        float celcius = scan.nextFloat();
       
        float fahrenheit = ((9/5.0f) * celcius) + 32;
        System.out.println("Fahrenheit is: " + fahrenheit);
        scan.close();

        // System.out.println("Enter fahrenheit: ");
        // float fahrenheit = scan.nextFloat();

        // float celcius = ((fahrenheit - 32)/9.0f)*5;
        // System.out.println("Celcius is: " + celcius);
    }
}
