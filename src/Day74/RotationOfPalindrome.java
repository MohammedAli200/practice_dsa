package Day74;

import java.util.Scanner;

public class RotationOfPalindrome {

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String temp = str + str;

        for (int i = 0; i < str.length(); i++) {
            String rotation = temp.substring(i, i + str.length());

            if (isPalindrome(rotation)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}