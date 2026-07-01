package Day58;

import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        String largest = words[0];

        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest word: " + largest);
    }
}