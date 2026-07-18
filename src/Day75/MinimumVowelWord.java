package Day75;

import java.util.Scanner;

public class MinimumVowelWord {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        String answer = "";
        int min = Integer.MAX_VALUE;

        for (String word : words) {

            int count = 0;

            for (int i = 0; i < word.length(); i++) {

                if (isVowel(word.charAt(i)))
                    count++;
            }

            if (count < min) {

                min = count;
                answer = word;
            }
        }

        System.out.println(answer);
    }
}