package Day65;

import java.util.Scanner;

public class CircularRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        String temp = s1 + s1;

        if (temp.contains(s2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}