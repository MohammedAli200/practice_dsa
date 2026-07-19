package Day76;

import java.util.Scanner;

public class LongestConsonantWord {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String longest = "";

        for (String word : words) {

            char last = Character.toLowerCase(word.charAt(word.length() - 1));

            if (!isVowel(last) && word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}