import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int K;
    public static int[][] grid;
    public static int[][] visited;
    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static Queue<Pair> queue = new LinkedList<>();
    public static boolean canGo(int nx, int ny) {
        return inRange(nx, ny)
                && visited[nx][ny] != 1
                && grid[nx][ny] != 1;
    }

    private static boolean inRange(int nx, int ny) {
        return nx >= 0 && nx < N && ny >= 0 && ny < N;
    }

    public static void BFS() {
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int x = pair.getX();
            int y = pair.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (canGo(nx, ny)) {
                    queue.add(new Pair(nx, ny));
                    visited[nx][ny] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        grid = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < K; i++) {
            int r = sc.nextInt(), c = sc.nextInt();
            visited[r-1][c-1] = 1;
            queue.add(new Pair(r-1, c-1));
        }

        BFS();

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j]==1) count++;
            }
        }
        System.out.println(count);
    }

    public static class Pair {
        private final int x;
        private final int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}