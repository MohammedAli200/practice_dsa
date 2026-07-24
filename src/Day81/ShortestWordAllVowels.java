package Day81;

import java.util.Scanner;

public class ShortestWordAllVowels {

    static boolean containsAllVowels(String word) {

        word = word.toLowerCase();

        return word.contains("a") &&
                word.contains("e") &&
                word.contains("i") &&
                word.contains("o") &&
                word.contains("u");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        String answer = "";

        for (String word : words) {

            if (containsAllVowels(word)) {

                if (answer.equals("") || word.length() < answer.length())
                    answer = word;
            }
        }

        if (answer.equals(""))
            System.out.println("No Such Word");
        else
            System.out.println(answer);
    }
}