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
    }
}
