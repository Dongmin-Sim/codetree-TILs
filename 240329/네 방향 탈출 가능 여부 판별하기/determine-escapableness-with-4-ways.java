import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static int N;
    public static int M;

    public static int[][] grid;
    public static int[][] visited;

    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};
    public static Queue<Pair> q;

    public static void BFS() {
        // q 가 없을 때까지
        while (!q.isEmpty()) {
            Pair currV = q.poll();
            int x = currV.getX();
            int y = currV.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (canGo(nx, ny)) {
                    // visited & push queue
                    visited[nx][ny] = 1;
                    q.add(new Pair(nx, ny));
                }
            }
        }
    }

    private static boolean canGo(int nx, int ny) {
        return inRange(nx, ny)
                && visited[nx][ny] != 1
                && grid[nx][ny] != 0;
    }

    private static boolean inRange(int nx, int ny) {
        return nx >= 0 && nx < N && ny >= 0 && ny < M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q = new LinkedList<>();

        N = sc.nextInt();
        M = sc.nextInt();

        grid = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        Pair start = new Pair(0, 0);
        visited[0][0] = 1;
        q.add(start);
        BFS();

        System.out.println(visited[N - 1][M - 1] == 1 ? 1 : 0);
    }


    public static class Pair {
        private int x;
        private int y;

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