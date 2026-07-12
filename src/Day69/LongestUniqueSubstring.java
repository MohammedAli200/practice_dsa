package Day69;

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int start = 0;
        int maxLength = 0;
        String answer = "";

        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {

            while (set.contains(str.charAt(end))) {
                set.remove(str.charAt(start));
                start++;
            }

            set.add(str.charAt(end));

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                answer = str.substring(start, end + 1);
            }
        }

        System.out.println("Longest Substring = " + answer);
        System.out.println("Length = " + maxLength);
    }
}