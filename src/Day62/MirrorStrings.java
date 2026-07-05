package Day62;

import java.util.Scanner;

public class MirrorStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        String rev = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            rev += s1.charAt(i);
        }

        if (rev.equals(s2)) {
            System.out.println("Mirror Strings");
        } else {
            System.out.println("Not Mirror Strings");
        }
    }
}