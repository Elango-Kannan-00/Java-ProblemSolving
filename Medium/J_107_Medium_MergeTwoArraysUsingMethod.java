package Medium;

import java.util.Scanner;

public class J_107_Medium_MergeTwoArraysUsingMethod {
    public static int[] arrayMerger(int[] a1, int[] a2) {
        int[] mergedArray = new int[a1.length + a2.length];
        
        for (int i=0; i<a1.length; i++) {
            mergedArray[i] = a1[i];
        }
        
        for (int i=0; i<a2.length; i++) {
            mergedArray[a1.length + i] = a2[i];
        }
        
        return mergedArray;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int size1 = scan.nextInt();

        System.out.print("Enter the size of 2nd array: ");
        int size2 = scan.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        System.out.println("Enter the 1st array elements....");
        for (int i=0; i<size1; i++) {
            array1[i] = scan.nextInt();
        }

        System.out.println("Enter the 2nd array elements....");
        for (int i=0; i<size2; i++) {
            array2[i] = scan.nextInt();
        }

        int[] mergedArray = arrayMerger(array1, array2);
        
        System.out.println("The merged array is...");
        for (var x : mergedArray) {
            System.out.print(x + " ");
        }
        scan.close();
    }    
}
