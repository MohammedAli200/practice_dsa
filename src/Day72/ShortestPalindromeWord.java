package Day72;

import java.util.Scanner;

public class ShortestPalindromeWord {

    static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        String smallest = "";

        for (String word : words) {

            if (isPalindrome(word)) {

                if (smallest.equals("") || word.length() < smallest.length()) {
                    smallest = word;
                }
            }
        }

        if (smallest.equals(""))
            System.out.println("No Palindrome Word Found");
        else
            System.out.println("Shortest Palindrome: " + smallest);
    }
}