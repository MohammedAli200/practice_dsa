package Day61;

import java.util.Scanner;

public class Atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int sign = 1;
        int result = 0;
        int i = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        while (i < str.length()) {
            result =
                    result * 10 +
                            (str.charAt(i) - '0');
            i++;
        }

        System.out.println(result * sign);
    }
}