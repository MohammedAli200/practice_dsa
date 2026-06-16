package Day43;

import java.util.*;

public class PalindromePairs {

    static boolean isPalindrome(
            String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left)
                    != s.charAt(right)) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String[] words =
                {"bat", "tab", "cat"};

        for (int i = 0;
             i < words.length;
             i++) {

            for (int j = 0;
                 j < words.length;
                 j++) {

                if (i != j) {

                    String combined =
                            words[i] + words[j];

                    if (isPalindrome(combined)) {

                        System.out.println(
                                i + " " + j
                        );
                    }
                }
            }
        }
    }
}