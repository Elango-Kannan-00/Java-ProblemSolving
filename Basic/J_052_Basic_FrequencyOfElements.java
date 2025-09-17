import java.util.Scanner;

public class J_052_Basic_FrequencyOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();

        int[] numArray = new int[size];
        for (int i=0; i<size; i++) { numArray[i] = scan.nextInt(); }

        boolean[] freqArray = new boolean[size];
        for (int i=0; i<size; i++) { 
            int count = 1;
            if (freqArray[i]) continue; 
            for (int j=i+1; j<size; j++){
                if (numArray[i] == numArray[j]){ count++; freqArray[j] = true; }
            }
            System.out.println(numArray[i] + " occured " + count + " time(s)");
        }
        scan.close();

        // // Another method
        //  System.out.println("Enter number of elements: ");
        // int n = scan.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter " + n + " integers: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = scan.nextInt();
        // }

        // Find maximum element to decide frequency array size
        // Finding the largest element in an array for defining the a=size of frequency array.
        // int max = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }

        // // Frequency array
        // int[] count = new int[max + 1];

        // // Count frequencies
        // for (int num : arr) {
        //     count[num]++;
        // }

        // // Print frequencies
        // System.out.println("Frequency of each number:");
        // for (int i = 0; i <= max; i++) {
        //     if (count[i] > 0) {
        //         System.out.println(i + " → " + count[i]);
        //     }
        // }
    }
}
