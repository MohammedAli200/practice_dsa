package Day65;

import java.util.Scanner;

public class ReverseCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        int j = s2.length() - 1;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(j)) {
                System.out.println("No");
                return;
            }

            j--;
        }

        System.out.println("Yes");
    }
}