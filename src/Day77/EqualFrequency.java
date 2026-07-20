package Day77;

import java.util.Scanner;

public class EqualFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int expected = 0;

        for (int i = 0; i < 256; i++) {

            if (freq[i] != 0) {

                if (expected == 0)
                    expected = freq[i];

                else if (freq[i] != expected) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}