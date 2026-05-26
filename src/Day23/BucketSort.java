package Day23;

import java.util.*;

public class BucketSort {
    public static void main(String[] args) {

        int[] arr = {
                42, 32, 33, 52,
                37, 47, 51
        };

        int bucketCount = 5;

        List<Integer>[] buckets =
                new ArrayList[bucketCount];

        for (int i = 0;
             i < bucketCount;
             i++) {

            buckets[i] =
                    new ArrayList<>();
        }

        for (int num : arr) {

            int bucketIndex =
                    num / 10;

            buckets[bucketIndex
                    % bucketCount]
                    .add(num);
        }

        int index = 0;

        for (List<Integer> bucket
                : buckets) {

            Collections.sort(bucket);

            for (int num : bucket) {

                arr[index++] = num;
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}