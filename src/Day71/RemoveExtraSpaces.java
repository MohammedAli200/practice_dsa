package Day71;

import java.util.Scanner;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        str = str.trim();

        String result = "";

        boolean space = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
                space = false;
            } else if (!space) {
                result += " ";
                space = true;
            }
        }

        System.out.println(result);
    }
}