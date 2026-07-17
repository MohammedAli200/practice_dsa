package Day74;

import java.util.Scanner;

public class LongestVowelSequence {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int max = 0, count = 0;
        String current = "", answer = "";

        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.charAt(i))) {
                current += str.charAt(i);
                count++;

                if (count > max) {
                    max = count;
                    answer = current;
                }
            } else {
                count = 0;
                current = "";
            }
        }

        System.out.println("Sequence = " + answer);
        System.out.println("Length = " + max);
    }
}