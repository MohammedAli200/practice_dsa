package Day87;

import java.util.Scanner;

public class CountSpecialCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch))
                count++;
        }

        System.out.println("Special Characters = " + count);
    }
}