// A delivery company stores the number of parcels delivered each hour in an array.
// If an hour’s delivery count is less than both its previous and next hour, it is considered a lowperformance hour.
// Write a program that:
// 1. Finds all low-performance hours (indexes where the count is smaller than neighbors).
// 2. Returns their indices and counts.
// 3. Counts how many such hours exist.

import java.util.Scanner;

public class J_101_Basic_DeliveryPerformance{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of entries: ");
        int entries = scan.nextInt();
        int[] hourArray = new int[entries];
        int[] indicesArray = new int[entries];
        int[] countArray = new int[entries];

        int k = 0;
        System.out.println("Enter the deliveries: ");
        for (int i=0; i<entries; i++){ hourArray[i] = scan.nextInt(); }
        for (int i=1; i<entries; i++){
            if (hourArray[i] < hourArray[i-1] && hourArray[i] < hourArray[i+1]){ 
                indicesArray[k] = i; 
                countArray[k] = hourArray[i];
                k++;
            }
        }
        
        System.out.println("Low Performance hours found: " + (k));
        for (int i=0; i<k; i++){ System.out.print(indicesArray[i] + " "); }
        System.out.println();
        for (int j=0; j<k; j++){ System.out.print(countArray[j] + " "); }
        scan.close();
    }
}