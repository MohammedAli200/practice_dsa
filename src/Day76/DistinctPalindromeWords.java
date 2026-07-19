package Day76;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctPalindromeWords {

    static boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            if (isPalindrome(word))
                set.add(word);
        }

        System.out.println(set.size());
    }
}