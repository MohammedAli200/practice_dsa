package Day76;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("");
            return;
        }

        String result = "";
        result += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}