package Day53;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Words: 0");
            return;
        }

        String[] words = str.split("\\s+");

        System.out.println("Words: " + words.length);
    }
}