package Day68;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : words) {
            if (map.get(word) == 1) {
                System.out.println("First Non-Repeated Word: " + word);
                return;
            }
        }

        System.out.println("No Unique Word");
    }
}