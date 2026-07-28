package Day85;

import java.util.Scanner;

public class LongestWordWithoutVowels {

    static boolean hasVowel(String word) {

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if ("aeiou".indexOf(ch) != -1)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String answer = "";

        for (String word : words) {

            if (!hasVowel(word) && word.length() > answer.length())
                answer = word;
        }

        System.out.println(answer);
    }
}