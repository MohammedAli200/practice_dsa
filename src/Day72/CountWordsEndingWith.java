package Day72;

import java.util.Scanner;

public class CountWordsEndingWith {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        System.out.print("Enter character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        String[] words = sentence.split("\\s+");

        int count = 0;

        for (String word : words) {

            if (word.charAt(word.length() - 1) == ch)
                count++;
        }

        System.out.println("Count = " + count);
    }
}