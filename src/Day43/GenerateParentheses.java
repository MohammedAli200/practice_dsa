package Day43;

import java.util.*;

public class GenerateParentheses {

    static void generate(
            String current,
            int open,
            int close,
            int n) {

        if (current.length() == 2 * n) {

            System.out.println(current);
            return;
        }

        if (open < n) {

            generate(
                    current + "(",
                    open + 1,
                    close,
                    n
            );
        }

        if (close < open) {

            generate(
                    current + ")",
                    open,
                    close + 1,
                    n
            );
        }
    }

    public static void main(String[] args) {

        int n = 3;

        generate("", 0, 0, n);
    }
}