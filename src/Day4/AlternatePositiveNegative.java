package Day4;

import java.util.*;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int i = 0, p = 0, n = 0;

        while (p < pos.size() && n < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }

        System.out.println(Arrays.toString(arr));
    }
}
