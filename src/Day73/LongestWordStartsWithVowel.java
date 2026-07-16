package Day73;

import java.util.Scanner;

public class LongestWordStartsWithVowel {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        String longest = "";

        for (String word : words) {

            if (isVowel(word.charAt(0))
                    && word.length() > longest.length()) {
                longest = word;
            }
        }

        if (longest.equals(""))
            System.out.println("No word starts with a vowel.");
        else
            System.out.println("Longest Word: " + longest);
    }
}