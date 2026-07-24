package Day81;

import java.util.Scanner;

public class LexicographicallyLargestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String largest = words[0];

        for (String word : words) {

            if (word.compareToIgnoreCase(largest) > 0)
                largest = word;
        }

        System.out.println("Largest Word: " + largest);
    }
}