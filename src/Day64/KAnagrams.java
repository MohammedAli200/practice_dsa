package Day64;

import java.util.Scanner;

public class KAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        int diff = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                diff += freq[i];
        }

        if (diff <= k)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}