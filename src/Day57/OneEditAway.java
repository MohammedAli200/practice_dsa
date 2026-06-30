package Day57;

import java.util.Scanner;

public class OneEditAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        int count = 0;

        int n = Math.min(s1.length(), s2.length());

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        count += Math.abs(s1.length() - s2.length());

        if (count <= 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}