package Day75;

import java.util.Scanner;

public class MaximumVowelWord {

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
        int max = 0;

        for (String word : words) {

            int count = 0;

            for (int i = 0; i < word.length(); i++) {

                if (isVowel(word.charAt(i)))
                    count++;
            }

            if (count > max) {

                max = count;
                answer = word;
            }
        }

        System.out.println(answer);
    }
}