package Day67;

import java.util.Scanner;

public class LongestCommonSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int max = 0;
        String result = "";

        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {

                int x = i;
                int y = j;
                String temp = "";

                while (x < s1.length() && y < s2.length()
                        && s1.charAt(x) == s2.charAt(y)) {

                    temp += s1.charAt(x);
                    x++;
                    y++;
                }

                if (temp.length() > max) {
                    max = temp.length();
                    result = temp;
                }
            }
        }

        System.out.println("Longest Common Substring: " + result);
    }
}