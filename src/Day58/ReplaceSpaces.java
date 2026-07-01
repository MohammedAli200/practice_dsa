package Day58;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter replacement character:");
        char ch = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result += ch;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}