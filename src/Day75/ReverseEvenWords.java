package Day75;

import java.util.Scanner;

public class ReverseEvenWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {

            if ((i + 1) % 2 == 0) {

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