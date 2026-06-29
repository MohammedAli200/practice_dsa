package Day56;

import java.util.Scanner;

public class CountPalindromicSubstrings {

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);

                if (isPalindrome(sub)) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
    }
}