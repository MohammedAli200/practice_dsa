package Day81;

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueWord {

    static boolean hasUniqueCharacters(String word) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            if (set.contains(word.charAt(i)))
                return false;

            set.add(word.charAt(i));
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String longest = "";

        for (String word : words) {

            if (hasUniqueCharacters() && word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Unique Word: " + longest);
    }
}