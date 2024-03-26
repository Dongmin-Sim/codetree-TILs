import java.util.Scanner;

public class Main {

    public static int M;
    public static int N;

    public static int[][] grid;
    public static int[][] visited;

    // down, right
    public static int[] dx = new int[]{1, 0};
    public static int[] dy = new int[]{0, 1};

    public static void DFS(int x, int y) {
        visited[x][y] = 1;

        for (int i = 0; i < 2; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY)) {
                DFS(newX, newY);
            }
        }

    }

    private static boolean canGo(int newX, int newY) {
        // 1. 해당 영역을 벗어나지 않아야 하고,
        // 2. 뱀이 없어야 하고,
        // 3. 방문한 적이 없어야 함.
        return inRange(newX, newY)
                && grid[newX][newY] != 0
                && visited[newX][newY] != 1;
    }

    private static boolean inRange(int newX, int newY) {
        return newX >= 0 && newX < M && newY >= 0 && newY < N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();

        grid = new int[M][N];
        visited = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        DFS(0, 0);

        if (visited[M - 1][N - 1] == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}