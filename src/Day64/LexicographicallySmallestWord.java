package Day64;

import java.util.Scanner;

public class LexicographicallySmallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        String smallest = words[0];

        for (String word : words) {
            if (word.compareTo(smallest) < 0) {
                smallest = word;
            }
        }

        System.out.println("Smallest Word: " + smallest);
    }
}