package Day66;

import java.util.Scanner;

public class EqualFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int expected = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                expected = freq[i];
                break;
            }
        }

        boolean equal = true;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0 && freq[i] != expected) {
                equal = false;
                break;
            }
        }

        if (equal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}