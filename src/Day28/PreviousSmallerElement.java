package Day28;

import java.util.*;

public class PreviousSmallerElement {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10};

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {

            while (!stack.isEmpty()
                    && stack.peek() >= num) {

                stack.pop();
            }

            System.out.print(
                    (stack.isEmpty()
                            ? -1
                            : stack.peek())
                            + " "
            );

            stack.push(num);
        }
    }
}