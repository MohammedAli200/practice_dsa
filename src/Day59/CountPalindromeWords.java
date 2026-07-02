package Day59;

import java.util.Scanner;

public class CountPalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        int count = 0;

        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            if (word.equalsIgnoreCase(rev)) {
                count++;
            }
        }

        System.out.println("Palindrome words: " + count);
    }
}