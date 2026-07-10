package Day67;

import java.util.Scanner;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int first = 0, second = 0;
        char firstChar = ' ', secondChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > first) {
                second = first;
                secondChar = firstChar;

                first = freq[i];
                firstChar = (char) i;
            } else if (freq[i] > second && freq[i] < first) {
                second = freq[i];
                secondChar = (char) i;
            }
        }

        System.out.println("Second Most Frequent Character: " + secondChar);
    }
}