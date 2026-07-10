package Day67;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String word : words) {
            set.add(word);
        }

        for (String word : set) {
            System.out.print(word + " ");
        }
    }
}