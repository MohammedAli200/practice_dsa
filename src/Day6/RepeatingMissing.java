package Day6;

public class RepeatingMissing {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};

        int repeating = -1;
        int missing = -1;

        boolean[] visited = new boolean[arr.length + 1];

        for (int num : arr) {
            if (visited[num]) {
                repeating = num;
            }
            visited[num] = true;
        }

        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                missing = i;
            }
        }

        System.out.println("Repeating: " + repeating);
        System.out.println("Missing: " + missing);
    }
}