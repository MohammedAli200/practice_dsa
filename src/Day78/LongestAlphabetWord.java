package Day78;

import java.util.Scanner;

public class LongestAlphabetWord {

    static boolean isAlphabetWord(String word) {

        for (int i = 0; i < word.length(); i++) {

            if (!Character.isLetter(word.charAt(i)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String longest = "";

        for (String word : words) {

            if (isAlphabetWord(word) &&
                    word.length() > longest.length()) {

                longest = word;
            }
        }

        System.out.println(longest);
    }
}