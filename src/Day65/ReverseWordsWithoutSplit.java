package Day65;

import java.util.Scanner;

public class ReverseWordsWithoutSplit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) != ' ') {
                word = str.charAt(i) + word;
            } else {
                System.out.print(word + " ");
                word = "";
            }
        }

        System.out.print(word);
    }
}