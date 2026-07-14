package Day71;

import java.util.Scanner;

public class ContainsAllVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        boolean a = false, e = false, i = false, o = false, u = false;

        for (int j = 0; j < str.length(); j++) {

            switch (str.charAt(j)) {
                case 'a': a = true; break;
                case 'e': e = true; break;
                case 'i': i = true; break;
                case 'o': o = true; break;
                case 'u': u = true; break;
            }
        }

        if (a && e && i && o && u)
            System.out.println("Contains All Vowels");
        else
            System.out.println("Does Not Contain All Vowels");
    }
}