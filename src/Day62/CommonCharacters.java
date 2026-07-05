package Day62;

import java.util.HashSet;
import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            set.add(ch);
        }

        System.out.print("Common Characters: ");

        for (char ch : s2.toCharArray()) {
            if (set.contains(ch)) {
                System.out.print(ch + " ");
                set.remove(ch);
            }
        }
    }
}