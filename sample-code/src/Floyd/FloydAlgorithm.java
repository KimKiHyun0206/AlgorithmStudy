package Floyd;

public class FloydAlgorithm {

    final static int V = 5;
    final static int INF = Integer.MAX_VALUE;

    static int[][] graph = {
            {0, 8, 4, 5, 5},
            {7, 0, 6, 2, 2},
            {3, 2, 0, 3, 7},
            {7, 3, 7, 0, 1},
            {3, 7, 4, 2, 0}
    };

    public static void main(String[] args) {

        int[][] graph = {
                {0, 8, 4, 5, 5},
                {7, 0, 6, 2, 2},
                {3, 2, 0, 3, 7},
                {7, 3, 7, 0, 1},
                {3, 7, 4, 2, 0}
        };

        calculate(graph);
    }

    private static void printSolution(int[][] dist) {
        System.out.println("Following matrix shows the shortest distance, between every pair of vertices");
        System.out.print("TO   ->  ");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < V; i++) {
            System.out.print("From " + i + " : ");
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void calculate(int[][] array) {
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                if (i == k) {
                    continue;
                }
                for (int j = 0; j < V; j++) {
                    if (j == k || j == i) {
                        continue;
                    }
                    array[i][j] = Math.min(array[i][k] + array[k][j], array[i][j]);
                }
            }
        }
        printSolution(array);
        printCount(array, graph);
    }

    private static void printCount(int[][] first, int[][] later) {
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < later.length; j++) {
                if (first[i][j] != later[i][j]) count++;
            }
        }
        System.out.println("Changed Vortex : " + count);
    }
}