package Day50;

import java.util.*;

public class CourseSchedule {

    public static void main(String[] args) {

        int courses = 4;

        int[][] prerequisites = {
                {1, 0},
                {2, 1},
                {3, 2}
        };

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0;
             i < courses;
             i++) {

            graph.add(new ArrayList<>());
        }

        int[] indegree =
                new int[courses];

        for (int[] edge
                : prerequisites) {

            graph.get(edge[1])
                    .add(edge[0]);

            indegree[edge[0]]++;
        }

        Queue<Integer> queue =
                new LinkedList<>();

        for (int i = 0;
             i < courses;
             i++) {

            if (indegree[i] == 0) {

                queue.offer(i);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            count++;

            for (int neighbor
                    : graph.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {

                    queue.offer(neighbor);
                }
            }
        }

        System.out.println(
                count == courses
        );
    }
}