package Day8;

import java.util.*;

public class PreviousGreaterElement {
    public static void main(String[] args) {

        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() &&
                    stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(stack.peek() + " ");
            }

            stack.push(arr[i]);
        }
    }
}