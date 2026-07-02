package Day59;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
    }
}