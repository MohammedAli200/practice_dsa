package Day55;

import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(
                            "First repeating character: "
                                    + str.charAt(i));
                    return;
                }
            }
        }

        System.out.println("No repeating character found.");
    }
}