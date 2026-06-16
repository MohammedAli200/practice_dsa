package Day43;

import java.util.*;

public class RemoveInvalidParentheses {

    static boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;
            }

            if (ch == ')') {

                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {

        String s = "()())()";

        Queue<String> queue =
                new LinkedList<>();

        Set<String> visited =
                new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {

            String current =
                    queue.poll();

            if (isValid(current)) {

                System.out.println(current);
                found = true;
            }

            if (found) {
                continue;
            }

            for (int i = 0;
                 i < current.length();
                 i++) {

                if (current.charAt(i)
                        != '('
                        &&
                        current.charAt(i)
                                != ')') {

                    continue;
                }

                String next =
                        current.substring(0, i)
                                +
                                current.substring(i + 1);

                if (!visited.contains(next)) {

                    visited.add(next);
                    queue.offer(next);
                }
            }
        }
    }
}