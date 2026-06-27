package Day54;

import java.util.Scanner;

public class SecondMostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int first = 0;
        int second = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > freq[first]) {
                second = first;
                first = i;
            } else if (freq[i] > freq[second]
                    && freq[i] != freq[first]) {
                second = i;
            }
        }

        System.out.println("Second most frequent character: "
                + (char) second);
    }
}