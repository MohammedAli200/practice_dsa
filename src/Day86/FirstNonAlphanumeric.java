package Day86;

import java.util.Scanner;

public class FirstNonAlphanumeric {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No Non-Alphanumeric Character Found");
    }
}