package Day68;

import java.util.Scanner;

public class OnlyAlphabets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isLetter(str.charAt(i))) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Contains Only Alphabets");
        else
            System.out.println("Contains Other Characters");
    }
}