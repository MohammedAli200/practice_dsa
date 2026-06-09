package Day36;

import java.util.*;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temp = {
                73,74,75,71,
                69,72,76,73
        };

        int[] result =
                new int[temp.length];

        Stack<Integer> stack =
                new Stack<>();

        for (int i = 0;
             i < temp.length;
             i++) {

            while (!stack.isEmpty()
                    && temp[i]
                    > temp[stack.peek()]) {

                int index =
                        stack.pop();

                result[index] =
                        i - index;
            }

            stack.push(i);
        }

        System.out.println(
                Arrays.toString(result)
        );
    }
}