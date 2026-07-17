package Day74;

import java.util.Scanner;

public class CountSpecialSubstrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
        }

        System.out.println("Count = " + count);
    }
}