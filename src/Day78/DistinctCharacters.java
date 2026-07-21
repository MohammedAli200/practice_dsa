package Day78;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println("Distinct Characters = " + set.size());
    }
}