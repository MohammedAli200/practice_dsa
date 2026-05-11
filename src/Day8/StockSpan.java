package Day8;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < prices.length; i++) {

            while (!stack.isEmpty()
                    && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty()
                    ? i + 1
                    : i - stack.peek();

            stack.push(i);
        }

        System.out.println(Arrays.toString(span));
    }
}