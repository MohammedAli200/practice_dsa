package Day62;

import java.util.Scanner;

public class MaxConsecutiveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int maxCount = 1;
        int count = 1;
        char result = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                result = str.charAt(i);
            }
        }

        System.out.println("Character: " + result);
        System.out.println("Count: " + maxCount);
    }
}