package Day61;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str =
                sc.nextLine()
                        .replaceAll("\\s+", "")
                        .toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        boolean flag = true;

        while (left < right) {
            if (str.charAt(left)
                    != str.charAt(right)) {
                flag = false;
                break;
            }

            left++;
            right--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}