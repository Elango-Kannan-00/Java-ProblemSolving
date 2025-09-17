import java.util.Scanner;

public class J_008_Basic_CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String vowels = "aeiouAEIOU";
        String others = "!@#$%^&*()_+:~><?.,|;";
        int vowel = 0, consonant = 0;

        for (int i=0; i<word.length(); i++){
            if (Character.isLetter(word.charAt(i))){
                if (vowels.indexOf(word.charAt(i)) != -1)
                    vowel++;
                else
                    consonant++;
            }
            else if (others.indexOf(word.charAt(i)) != -1) 
                continue;
        }

        System.out.println("Vowel count: " + vowel);
        System.out.println("Consonant count: " + consonant);

        scan.close();
    }
}