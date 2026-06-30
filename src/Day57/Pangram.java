package Day57;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine().toLowerCase();

        boolean[] present = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for (boolean b : present) {
            if (!b) {
                System.out.println("Not Pangram");
                return;
            }
        }

        System.out.println("Pangram");
    }
}