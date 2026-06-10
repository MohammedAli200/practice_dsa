package Day37;

import java.util.*;

public class RemoveKDigits {

    public static void main(String[] args) {

        String num = "1432219";
        int k = 3;

        Stack<Character> stack =
                new Stack<>();

        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        while (k-- > 0) {
            stack.pop();
        }

        StringBuilder sb =
                new StringBuilder();

        for (char ch : stack) {
            sb.append(ch);
        }

        while (sb.length() > 0
                && sb.charAt(0) == '0') {

            sb.deleteCharAt(0);
        }

        System.out.println(
                sb.length() == 0
                        ? "0"
                        : sb.toString()
        );
    }
}