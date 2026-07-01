package Day58;

import java.util.Scanner;

public class RotationManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Rotation");
            return;
        }

        String temp = s1 + s1;
        boolean found = false;

        for (int i = 0; i <= temp.length() - s2.length(); i++) {
            String sub = temp.substring(i,
                    i + s2.length());

            if (sub.equals(s2)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}