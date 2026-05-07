package Day4;

import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("First Repeating: " + num);
                break;
            }
            set.add(num);
        }
    }
}