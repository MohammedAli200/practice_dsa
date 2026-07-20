package Day77;

import java.util.Scanner;

public class SmallestWindow {

    static boolean containsAll(String window, String pattern) {

        for (int i = 0; i < pattern.length(); i++) {

            if (!window.contains("" + pattern.charAt(i)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        String answer = "";

        for (int i = 0; i < text.length(); i++) {

            for (int j = i + 1; j <= text.length(); j++) {

                String sub = text.substring(i, j);

                if (containsAll(sub, pattern)) {

                    if (answer.equals("") ||
                            sub.length() < answer.length()) {

                        answer = sub;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}