package Day79;

import java.util.HashMap;
import java.util.Scanner;

public class LeastFrequentWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().toLowerCase();

        String[] words = sentence.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String result = "";
        int min = Integer.MAX_VALUE;

        for (String word : map.keySet()) {

            if (map.get(word) < min) {
                min = map.get(word);
                result = word;
            }
        }

        System.out.println("Least Frequent Word: " + result);
        System.out.println("Frequency: " + min);
    }
}