package Day76;

import java.util.Scanner;

public class VowelSubstrings {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!isVowel(str.charAt(i)))
                continue;

            for (int j = i; j < str.length(); j++) {

                if (isVowel(str.charAt(j)))
                    count++;
                else
                    break;
            }
        }

        System.out.println(count);
    }
}