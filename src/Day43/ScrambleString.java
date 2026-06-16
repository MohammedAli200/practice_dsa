package Day43;

import java.util.*;

public class ScrambleString {

    static Map<String, Boolean> memo =
            new HashMap<>();

    static boolean isScramble(
            String s1,
            String s2) {

        if (s1.equals(s2)) {
            return true;
        }

        String key = s1 + "#" + s2;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int n = s1.length();

        for (int i = 1; i < n; i++) {

            boolean swap =
                    isScramble(
                            s1.substring(0, i),
                            s2.substring(n - i)
                    )
                            &&
                            isScramble(
                                    s1.substring(i),
                                    s2.substring(0, n - i)
                            );

            boolean noSwap =
                    isScramble(
                            s1.substring(0, i),
                            s2.substring(0, i)
                    )
                            &&
                            isScramble(
                                    s1.substring(i),
                                    s2.substring(i)
                            );

            if (swap || noSwap) {

                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    public static void main(String[] args) {

        String s1 = "great";
        String s2 = "rgeat";

        System.out.println(
                isScramble(s1, s2)
        );
    }
}