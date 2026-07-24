package Day81;

import java.util.Scanner;

public class WordsContainingDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        int count = 0;

        for (String word : words) {

            for (int i = 0; i < word.length(); i++) {

                if (Character.isDigit(word.charAt(i))) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Words Containing Digits = " + count);
    }
}