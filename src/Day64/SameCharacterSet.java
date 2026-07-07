package Day64;

import java.util.HashSet;
import java.util.Scanner;

public class SameCharacterSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char ch : s1.toCharArray())
            set1.add(ch);

        for (char ch : s2.toCharArray())
            set2.add(ch);

        if (set1.equals(set2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}