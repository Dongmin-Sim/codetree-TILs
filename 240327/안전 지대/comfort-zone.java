import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;

    public static int[][] grid;
    public static int[][] visited;

    // up down left right
    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};
    public static int K = -1;
    public static int rain;
    public static int count = 0;
    public static int[] safe_zone;

    public static void DFS(int x, int y) {
        visited[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY)) {
                DFS(newX, newY);
            }
        }
    }

    public static boolean canGo(int x, int y) {
        return inRange(x, y)
                && grid[x][y] > rain
                && visited[x][y] != 1;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        grid = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
                K = Math.max(K, grid[i][j]);
            }
        }

        safe_zone = new int[K];
        for (int i = 1; i < K; i++) {
            rain = i;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (canGo(j, k)) {
                        DFS(j, k);
                        count++;
                    }
                }
            }
            safe_zone[i] = count;

            count = 0;
            visited = new int[N][M];
        }

        int minK = 0;
        int maxSafe = safe_zone[0];
        for (int i = 1; i < safe_zone.length; i++) {
            if (safe_zone[i] > maxSafe) {
                maxSafe = safe_zone[i];
                minK = i;
            }
        }
        System.out.println(minK + " " + maxSafe);
    }
}