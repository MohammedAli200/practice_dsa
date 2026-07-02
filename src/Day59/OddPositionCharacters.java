package Day59;

import java.util.Scanner;

public class OddPositionCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Characters at odd positions:");

        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}