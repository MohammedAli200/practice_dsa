package Day60;

import java.util.Scanner;

public class OneCharacterDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}