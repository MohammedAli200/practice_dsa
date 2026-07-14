package Day71;

import java.util.Scanner;

public class CommonPrefix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String result = "";

        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {

            if (s1.charAt(i) == s2.charAt(i)) {
                result += s1.charAt(i);
            } else {
                break;
            }
        }

        System.out.println("Longest Common Prefix: " + result);
    }
}