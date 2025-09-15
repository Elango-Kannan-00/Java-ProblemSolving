import java.util.Scanner;

public class J_098_Basic_FibonacciUsingRecursion {
    static int fibonacci(int n) {
        if (n == 0) return 0;        // Base case 1
        if (n == 1) return 1;        // Base case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = scan.nextInt();

        System.out.print("The Fibonacci series of first " + range + " terms is: ");
        for (int i = 0; i < range; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scan.close();

    // Finding the nth fibonacci number.
    // static int fibonacci(int range){
    //     if (range == 0) return 0;
    //     if (range == 1) return 1;
    //     else return fibonacci(range - 1) + fibonacci(range - 2);
    // }
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("Enter any raange: ");
    //     int range = scan.nextInt();
    //     System.out.println("The fibonacci series of first " + range + " is " + fibonacci(range));
    //     scan.close();
    }
}
