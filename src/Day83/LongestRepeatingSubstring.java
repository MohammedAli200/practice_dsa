package Day83;

import java.util.Scanner;

public class LongestRepeatingSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (str.indexOf(sub) != str.lastIndexOf(sub)
                        && sub.length() > answer.length()) {

                    answer = sub;
                }
            }
        }

        System.out.println(answer);
    }
}