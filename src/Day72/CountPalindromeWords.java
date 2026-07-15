package Day72;

import java.util.Scanner;

public class CountPalindromeWords {

    static boolean isPalindrome(String word) {

        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        int count = 0;

        for (String word : words) {

            if (isPalindrome(word))
                count++;
        }

        System.out.println("Palindrome Words = " + count);
    }
}