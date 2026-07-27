package Day84;

import java.util.Scanner;

public class SmallestRepeatingPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length();

        for (int len = 1; len <= n; len++) {

            if (n % len != 0)
                continue;

            String pattern = str.substring(0, len);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n / len; i++)
                sb.append(pattern);

            if (sb.toString().equals(str)) {
                System.out.println(pattern);
                return;
            }
        }

        System.out.println("No Repeating Pattern");
    }
}