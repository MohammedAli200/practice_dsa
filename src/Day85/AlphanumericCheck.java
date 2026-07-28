package Day85;

import java.util.Scanner;

public class AlphanumericCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isLetterOrDigit(str.charAt(i))) {
                System.out.println("Not Alphanumeric");
                return;
            }
        }

        System.out.println("Alphanumeric");
    }
}