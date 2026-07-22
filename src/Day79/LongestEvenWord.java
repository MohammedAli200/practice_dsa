package Day79;

import java.util.Scanner;

public class LongestEvenWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String longest = "";

        for (String word : words) {

            if (word.length() % 2 == 0 &&
                    word.length() > longest.length()) {

                longest = word;
            }
        }

        System.out.println(longest);
    }
}