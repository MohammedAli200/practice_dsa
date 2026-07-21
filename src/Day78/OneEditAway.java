package Day78;

import java.util.Scanner;

public class OneEditAway {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (Math.abs(s1.length() - s2.length()) > 1) {
            System.out.println("No");
            return;
        }

        if (s1.equals(s2)) {
            System.out.println("Yes");
            return;
        }

        int i = 0, j = 0, count = 0;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {

                if (++count > 1) {
                    System.out.println("No");
                    return;
                }

                if (s1.length() > s2.length())
                    i++;
                else if (s2.length() > s1.length())
                    j++;
                else {
                    i++;
                    j++;
                }
            }
        }

        System.out.println("Yes");
    }
}