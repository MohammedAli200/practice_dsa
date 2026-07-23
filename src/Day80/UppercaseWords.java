package Day80;

import java.util.Scanner;

public class UppercaseWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        int count = 0;

        for (String word : words) {

            boolean upper = true;

            for (int i = 0; i < word.length(); i++) {

                if (!Character.isUpperCase(word.charAt(i))) {
                    upper = false;
                    break;
                }
            }

            if (upper)
                count++;
        }

        System.out.println("Uppercase Words = " + count);
    }
}