package Day77;

import java.util.Scanner;

public class LongestCommonSuffix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String result = "";

        int i = s1.length() - 1;
        int j = s2.length() - 1;

        while (i >= 0 && j >= 0 &&
                s1.charAt(i) == s2.charAt(j)) {

            result = s1.charAt(i) + result;
            i--;
            j--;
        }

        System.out.println(result);
    }
}