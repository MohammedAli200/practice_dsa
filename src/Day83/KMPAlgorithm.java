package Day83;

import java.util.Scanner;

public class KMPAlgorithm {

    static void computeLPS(String pat, int[] lps) {

        int len = 0;
        int i = 1;

        while (i < pat.length()) {

            if (pat.charAt(i) == pat.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();
        String pat = sc.nextLine();

        int[] lps = new int[pat.length()];
        computeLPS(pat, lps);

        int i = 0, j = 0;

        while (i < txt.length()) {

            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == pat.length()) {

                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];

            } else if (i < txt.length() &&
                    txt.charAt(i) != pat.charAt(j)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
    }
}