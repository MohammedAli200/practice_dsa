package Day71;

import java.util.Scanner;

public class LongestWordWithoutSplit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine() + " ";

        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        System.out.println("Longest Word: " + longest);
    }
}