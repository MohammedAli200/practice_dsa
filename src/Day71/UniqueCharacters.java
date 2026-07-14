package Day71;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.print("Unique Characters: ");

        for (int i = 0; i < str.length(); i++) {

            if (freq[str.charAt(i)] == 1) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}