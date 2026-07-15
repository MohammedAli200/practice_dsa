package Day72;

import java.util.Scanner;

public class ReverseAlternateWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {

            if (i % 2 == 1) {

                for (int j = words[i].length() - 1; j >= 0; j--) {
                    System.out.print(words[i].charAt(j));
                }

            } else {
                System.out.print(words[i]);
            }

            System.out.print(" ");
        }
    }
}