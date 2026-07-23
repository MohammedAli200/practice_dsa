package Day80;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharactersCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if (set.contains(str.charAt(i))) {
                System.out.println("Duplicate Characters Found");
                return;
            }

            set.add(str.charAt(i));
        }

        System.out.println("All Characters Are Unique");
    }
}