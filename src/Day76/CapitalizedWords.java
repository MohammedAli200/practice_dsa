package Day76;

import java.util.Scanner;

public class CapitalizedWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        for (String word : words) {

            if (!Character.isUpperCase(word.charAt(0))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}