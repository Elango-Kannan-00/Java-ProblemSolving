import java.util.Scanner;

public class J_062_Basic_CheckStringPalindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scan.nextLine();
        String originalWord = word.toLowerCase();

        boolean isPalindrome = true;
        for (int i=1; i<=originalWord.length()/2; i++){
            if ((originalWord.charAt(i-1)) != originalWord.charAt(originalWord.length()-i)) { isPalindrome = false; break; }
        }
        
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        scan.close();

        // Two pointer approach for Optimization
        // boolean isPalindrome = true;
        // int left = 0, right = word.length() - 1;

        // while (left < right) {
        //     if (word.charAt(left) != word.charAt(right)) {
        //         isPalindrome = false;
        //         break;
        //     }
        //     left++;
        //     right--;
        // }

        // System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        // scan.close();
    }
}
