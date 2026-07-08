package Day65;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccurringWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();

        String[] words = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {

            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        System.out.println(ans);
    }
}