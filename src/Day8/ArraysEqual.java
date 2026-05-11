package Day8;

import java.util.*;

public class ArraysEqual {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean equal = Arrays.equals(arr1, arr2);

        System.out.println(equal);
    }
}