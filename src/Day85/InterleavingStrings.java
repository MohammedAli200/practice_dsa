package Day85;

import java.util.Scanner;

public class InterleavingStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        if (s1.length() + s2.length() != s3.length()) {
            System.out.println("No");
            return;
        }

        int i = 0, j = 0;

        for (int k = 0; k < s3.length(); k++) {

            if (i < s1.length() && s3.charAt(k) == s1.charAt(i))
                i++;
            else if (j < s2.length() && s3.charAt(k) == s2.charAt(j))
                j++;
            else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}