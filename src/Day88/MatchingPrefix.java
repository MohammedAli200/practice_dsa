package Day88;

import java.util.Scanner;

public class MatchingPrefix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int count = 0;

        int len = Math.min(s1.length(), s2.length());

        while (count < len && s1.charAt(count) == s2.charAt(count)) {
            count++;
        }

        System.out.println("Matching Prefix Length = " + count);
    }
}