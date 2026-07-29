package Day86;

import java.util.Scanner;

public class LowercaseCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isLowerCase(str.charAt(i))) {
                System.out.println("Contains Other Characters");
                return;
            }
        }

        System.out.println("Only Lowercase Letters");
    }
}