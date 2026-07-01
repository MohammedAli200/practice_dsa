package Day58;

import java.util.Scanner;

public class WordsStartingWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        int count = 0;

        for (String word : words) {
            char ch = Character.toLowerCase(word.charAt(0));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}