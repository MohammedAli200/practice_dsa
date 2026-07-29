package Day86;

import java.util.Scanner;

public class UppercaseCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isUpperCase(str.charAt(i))) {
                System.out.println("Contains Other Characters");
                return;
            }
        }

        System.out.println("Only Uppercase Letters");
    }
}