package Day64;

import java.util.Scanner;

public class LexicographicallyLargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        String largest = words[0];

        for (String word : words) {
            if (word.compareTo(largest) > 0) {
                largest = word;
            }
        }

        System.out.println("Largest Word: " + largest);
    }
}