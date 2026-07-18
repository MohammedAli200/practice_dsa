package Day75;

import java.util.Scanner;

public class WordsEndingWithVowel {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        int count = 0;

        for (String word : words) {

            char last = word.charAt(word.length() - 1);

            if (isVowel(last))
                count++;
        }

        System.out.println("Count = " + count);
    }
}