package Day88;

import java.util.Scanner;

public class ValidIdentifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Invalid Identifier");
            return;
        }

        if (!Character.isLetter(str.charAt(0)) &&
                str.charAt(0) != '_') {

            System.out.println("Invalid Identifier");
            return;
        }

        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch) &&
                    ch != '_') {

                System.out.println("Invalid Identifier");
                return;
            }
        }

        System.out.println("Valid Identifier");
    }
}