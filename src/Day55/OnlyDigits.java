package Day55;

import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Contains non-digit characters");
        }
    }
}