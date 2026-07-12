package Day69;

import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split("\\s+");

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            set.add(word);
        }

        System.out.println("Unique Words = " + set.size());
    }
}