package Day77;

import java.util.Scanner;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int first = 0, second = 0;
        char result = ' ';

        for (int i = 0; i < 256; i++) {

            if (freq[i] > first) {
                second = first;
                first = freq[i];
            } else if (freq[i] > second && freq[i] < first) {
                second = freq[i];
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == second) {
                result = str.charAt(i);
                break;
            }
        }

        System.out.println("Second Most Frequent Character: " + result);
    }
}