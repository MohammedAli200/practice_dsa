package Day76;

import java.util.Scanner;

public class CharacterTransitions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int transitions = 0;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(i - 1))
                transitions++;
        }

        System.out.println("Transitions = " + transitions);
    }
}