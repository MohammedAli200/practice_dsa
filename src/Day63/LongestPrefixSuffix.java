package Day63;

import java.util.Scanner;

public class LongestPrefixSuffix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = "";

        for (int i = 1; i < str.length(); i++) {

            String prefix = str.substring(0, i);
            String suffix = str.substring(str.length() - i);

            if (prefix.equals(suffix)) {
                ans = prefix;
            }
        }

        System.out.println("Longest Prefix-Suffix: " + ans);
    }
}