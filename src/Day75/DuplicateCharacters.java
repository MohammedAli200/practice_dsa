package Day75;

import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {

            freq[str.charAt(i)]++;
        }

        boolean[] printed = new boolean[256];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (freq[ch] > 1 && !printed[ch]) {

                System.out.println(ch + " = " + freq[ch]);
                printed[ch] = true;
            }
        }
    }
}