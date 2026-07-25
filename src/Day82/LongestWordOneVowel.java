package Day82;

import java.util.Scanner;

public class LongestWordOneVowel {

    static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String answer = "";

        for (String word : words) {

            int vowels = 0;

            for (int i = 0; i < word.length(); i++) {

                if (isVowel(word.charAt(i)))
                    vowels++;
            }

            if (vowels == 1 && word.length() > answer.length())
                answer = word;
        }

        System.out.println(answer);
    }
}