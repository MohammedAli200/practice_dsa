package Day73;

import java.util.Scanner;

public class MinimumFrequencyCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int min = Integer.MAX_VALUE;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (freq[str.charAt(i)] < min) {
                min = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        System.out.println("Minimum Frequency Character: " + result);
    }
}