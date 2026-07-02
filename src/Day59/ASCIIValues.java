package Day59;

import java.util.Scanner;

public class ASCIIValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(ch + " -> " + (int) ch);
        }
    }
}