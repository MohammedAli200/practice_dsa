package Day85;

import java.util.Scanner;

public class OnlyDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("Contains Non-Digit Characters");
                return;
            }
        }

        System.out.println("Only Digits");
    }
}