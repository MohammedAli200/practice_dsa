package Day58;

import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split("\\s+");
        boolean[] visited = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(words[i]);
            }
        }
    }
}