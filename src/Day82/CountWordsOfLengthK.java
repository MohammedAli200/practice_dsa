package Day82;

import java.util.Scanner;

public class CountWordsOfLengthK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        String[] words = sentence.split("\\s+");

        int count = 0;

        for (String word : words) {

            if (word.length() == k)
                count++;
        }

        System.out.println("Count = " + count);
    }
}