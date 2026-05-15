package Day12;

public class MaxNonAdjacentSum {
    public static void main(String[] args) {

        int[] arr = {5, 5, 10, 100, 10, 5};

        int include = arr[0];
        int exclude = 0;

        for (int i = 1;
             i < arr.length;
             i++) {

            int newExclude =
                    Math.max(include,
                            exclude);

            include = exclude + arr[i];
            exclude = newExclude;
        }

        System.out.println(
                "Maximum Sum: "
                        + Math.max(include,
                        exclude)
        );
    }
}