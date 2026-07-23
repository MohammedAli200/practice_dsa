package Day80;

import java.util.Scanner;

public class LongestPrefixSuffix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String answer = "";

        for (int len = 1; len < str.length(); len++) {

            String prefix = str.substring(0, len);
            String suffix = str.substring(str.length() - len);

            if (prefix.equals(suffix))
                answer = prefix;
        }

        System.out.println(answer);
    }
}