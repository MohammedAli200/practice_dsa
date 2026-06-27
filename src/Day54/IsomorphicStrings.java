package Day54;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        HashMap<Character, Character> map =
                new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    System.out.println("Not Isomorphic");
                    return;
                }
            } else {
                map.put(c1, c2);
            }
        }

        System.out.println("Isomorphic");
    }
}