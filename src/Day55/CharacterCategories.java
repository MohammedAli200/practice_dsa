package Day55;

import java.util.Scanner;

public class CharacterCategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}