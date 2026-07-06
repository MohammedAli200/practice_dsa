package Day63;

import java.util.Scanner;

public class StringInterleaving {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int i = 0, j = 0, k = 0;

        while (k < s3.length()) {

            if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
                i++;
            } else if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
                j++;
            } else {
                System.out.println("Invalid Interleaving");
                return;
            }

            k++;
        }

        System.out.println("Valid Interleaving");
    }
}