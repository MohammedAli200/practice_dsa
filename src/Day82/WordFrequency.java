package Day82;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().toLowerCase();

        String[] words = sentence.split("\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}