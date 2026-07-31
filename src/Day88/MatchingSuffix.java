package Day88;

import java.util.Scanner;

public class MatchingSuffix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int i = s1.length() - 1;
        int j = s2.length() - 1;

        int count = 0;

        while (i >= 0 && j >= 0 &&
                s1.charAt(i) == s2.charAt(j)) {

            count++;
            i--;
            j--;
        }

        System.out.println("Matching Suffix Length = " + count);
    }
}