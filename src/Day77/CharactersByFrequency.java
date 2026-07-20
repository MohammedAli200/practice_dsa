package Day77;

import java.util.Scanner;

public class CharactersByFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        for (int i = 0; i < 256; i++) {

            int max = 0;
            char ch = 0;

            for (int j = 0; j < 256; j++) {

                if (freq[j] > max) {
                    max = freq[j];
                    ch = (char) j;
                }
            }

            if (max == 0)
                break;

            System.out.println(ch + " = " + max);
            freq[ch] = 0;
        }
    }
}