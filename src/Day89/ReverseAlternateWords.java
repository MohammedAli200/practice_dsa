package Day89;

import java.util.Scanner;

public class ReverseAlternateWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        for (int i = 0; i < words.length; i++) {

            if (i % 2 == 1) {

                StringBuilder sb = new StringBuilder(words[i]);
                System.out.print(sb.reverse());

            } else {

                System.out.print(words[i]);
            }

            if (i != words.length - 1)
                System.out.print(" ");
        }
    }
}