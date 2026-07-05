package Day62;

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1) + " ";
        }

        System.out.println(result.trim());
    }
}