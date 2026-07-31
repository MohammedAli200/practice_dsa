package Day88;

import java.util.Scanner;

public class LongestCharacterSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char result = str.charAt(0);

        int max = 1;
        int current = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {

                current++;

                if (current > max) {
                    max = current;
                    result = str.charAt(i);
                }

            } else {

                current = 1;
            }
        }

        System.out.println("Character = " + result);
        System.out.println("Length = " + max);
    }
}