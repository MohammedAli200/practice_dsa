package Day66;

import java.util.Scanner;

public class LongestWordParagraph {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a paragraph: ");
        String str = sc.nextLine();

        str = str.replaceAll("[^a-zA-Z ]", "");

        String[] words = str.split("\\s+");

        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Word: " + longest);
    }
}