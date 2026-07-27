package Day84;

import java.util.Scanner;

public class RunLengthEncoding {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= str.length(); i++) {

            if (i < str.length() &&
                    str.charAt(i) == str.charAt(i - 1)) {

                count++;

            } else {

                result.append(str.charAt(i - 1));
                result.append(count);

                count = 1;
            }
        }

        System.out.println(result);
    }
}