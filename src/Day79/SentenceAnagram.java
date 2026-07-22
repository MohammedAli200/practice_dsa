package Day79;

import java.util.Arrays;
import java.util.Scanner;

public class SentenceAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}