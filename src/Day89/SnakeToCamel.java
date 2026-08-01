package Day89;

import java.util.Scanner;

public class SnakeToCamel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        boolean upper = false;

        for (char ch : str.toCharArray()) {

            if (ch == '_') {
                upper = true;
            } else {

                if (upper) {
                    result.append(Character.toUpperCase(ch));
                    upper = false;
                } else {
                    result.append(ch);
                }
            }
        }

        System.out.println(result);
    }
}