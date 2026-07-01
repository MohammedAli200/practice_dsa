package Day58;

import java.util.Scanner;

public class CountSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '.' || ch == '?' || ch == '!') {
                count++;
            }
        }

        System.out.println("Sentences: " + count);
    }
}