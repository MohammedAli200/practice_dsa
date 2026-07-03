package Day60;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        if (set.size() == str.length()) {
            System.out.println("Unique");
        } else {
            System.out.println("Not Unique");
        }
    }
}