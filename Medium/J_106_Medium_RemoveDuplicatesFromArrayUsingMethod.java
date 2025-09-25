package Medium;

import java.util.Scanner;

public class J_106_Medium_RemoveDuplicatesFromArrayUsingMethod {

    public static int[] duplicateRemover(int[] a) {
        int index = 0;
        int[] dupRemove = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean repeat = true;
            for (int k = 0; k < index; k++) {
                if (dupRemove[k] == a[i]) {
                    repeat = false;
                    break;
                }
            }
            if (repeat) {
                dupRemove[index] = a[i];
                index++;
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = dupRemove[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count of array: ");
        int count = scan.nextInt();

        int[] numArray = new int[count];
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            numArray[i] = scan.nextInt();
        }

        int[] unique = duplicateRemover(numArray);
        System.out.println("Array after removing duplicates:");
        for (int x : unique) {
            System.out.print(x + " ");
        }
        scan.close();
    }
}