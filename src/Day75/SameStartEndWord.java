package Day75;

import java.util.Scanner;

public class SameStartEndWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        int count = 0;

        for (String word : words) {

            if (Character.toLowerCase(word.charAt(0)) ==
                    Character.toLowerCase(word.charAt(word.length() - 1))) {

                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}