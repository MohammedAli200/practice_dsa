package Day57;

import java.util.HashSet;
import java.util.Scanner;

public class SmallestDistinctWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        int distinct = set.size();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            HashSet<Character> temp = new HashSet<>();

            for (int j = i; j < str.length(); j++) {
                temp.add(str.charAt(j));

                if (temp.size() == distinct) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }

        System.out.println("Length: " + min);
    }
}