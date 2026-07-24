package Day81;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRecurringWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        String[] words = sentence.split("\\s+");

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            if (set.contains(word)) {
                System.out.println("First Recurring Word: " + word);
                return;
            }

            set.add(word);
        }

        System.out.println("No Recurring Word Found");
    }
}