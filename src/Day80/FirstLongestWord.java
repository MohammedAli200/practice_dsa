package Day80;

import java.util.Scanner;

public class FirstLongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String longest = words[0];

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("First Longest Word: " + longest);
    }
}