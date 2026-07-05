package Day62;

import java.util.Scanner;

public class LargestPalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        String largest = "";

        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            if (word.equalsIgnoreCase(rev)
                    && word.length() > largest.length()) {
                largest = word;
            }
        }

        if (largest.equals("")) {
            System.out.println("No palindrome word found");
        } else {
            System.out.println("Largest palindrome: " + largest);
        }
    }
}