package Day37;

import java.util.*;

public class AsteroidCollision {

    public static void main(String[] args) {

        int[] asteroids = {5, 10, -5};

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty()
                    && asteroid < 0
                    && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {

                    stack.pop();

                } else if (stack.peek() == -asteroid) {

                    stack.pop();
                    destroyed = true;
                    break;

                } else {

                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        System.out.println(stack);
    }
}