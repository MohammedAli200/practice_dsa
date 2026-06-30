package Day57;

import java.util.Arrays;
import java.util.Scanner;

public class ValidShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        if (s1.length() + s2.length() != s3.length()) {
            System.out.println("Invalid Shuffle");
            return;
        }

        char[] a = (s1 + s2).toCharArray();
        char[] b = s3.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Valid Shuffle");
        } else {
            System.out.println("Invalid Shuffle");
        }
    }
}