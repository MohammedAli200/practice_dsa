package Day86;

import java.util.Scanner;

public class ExtractDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                digits.append(ch);
        }

        if (digits.length() == 0)
            System.out.println("No Digits Found");
        else
            System.out.println(digits);
    }
}