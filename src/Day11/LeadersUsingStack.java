package Day11;

import java.util.*;

public class LeadersUsingStack {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        Stack<Integer> stack = new Stack<>();

        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max) {
                stack.push(arr[i]);
                max = arr[i];
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}