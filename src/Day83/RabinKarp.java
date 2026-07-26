package Day83;

import java.util.Scanner;

public class RabinKarp {

    static final int d = 256;
    static final int q = 101;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String txt = sc.nextLine();

        System.out.print("Enter Pattern: ");
        String pat = sc.nextLine();

        int m = pat.length();
        int n = txt.length();

        int p = 0, t = 0, h = 1;

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        for (int i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {

            if (p == t) {

                int j;
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == m)
                    System.out.println("Pattern found at index " + i);
            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

                if (t < 0)
                    t += q;
            }
        }
    }
}