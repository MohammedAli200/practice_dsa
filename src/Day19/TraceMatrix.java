package Day19;

public class TraceMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 4, 1},
                {5, 3, 7},
                {8, 6, 9}
        };

        int trace = 0;

        for (int i = 0;
             i < matrix.length;
             i++) {

            trace += matrix[i][i];
        }

        System.out.println(
                "Trace: "
                        + trace
        );
    }
}