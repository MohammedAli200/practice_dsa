package Day82;

import java.util.Scanner;

public class LexicographicallySmallestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String smallest = words[0];

        for (String word : words) {

            if (word.compareToIgnoreCase(smallest) < 0)
                smallest = word;
        }

        System.out.println("Smallest Word: " + smallest);
    }
}