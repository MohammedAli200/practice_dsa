package Day3;

import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        Set<Integer> set = new HashSet<>();

        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        System.out.println(set);
    }
}