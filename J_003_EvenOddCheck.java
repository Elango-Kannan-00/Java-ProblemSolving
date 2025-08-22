import java.util.Scanner;

public class J_003_EvenOddCheck{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number % 2 == 0)
            System.out.println("Even");
        else 
            System.out.println("Odd");

        scan.close();   
    }
}