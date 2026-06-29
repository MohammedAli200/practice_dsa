package Day56;

import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int n = str.length();
        int count = n * (n + 1) / 2;

        System.out.println("Total substrings: " + count);
    }
}