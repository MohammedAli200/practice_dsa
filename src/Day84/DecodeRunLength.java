package Day84;

import java.util.Scanner;

public class DecodeRunLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {

            char ch = str.charAt(i);
            int count = str.charAt(i + 1) - '0';

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}