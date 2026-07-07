package Day64;

import java.util.Scanner;

public class LongestRepeatingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char maxChar = str.charAt(0);
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Character: " + maxChar);
        System.out.println("Length: " + maxCount);
    }
}