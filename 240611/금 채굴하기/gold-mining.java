import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;

    private final static int[] dx = new int[]{1, -1, 0, 0};
    private final static int[] dy = new int[]{0, 0, -1, 1};

    private static int[][] matrix;
    private static int[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxGold = 0;

        for (int k = 0; k < (N/2); k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    visited = new int[N][N];
                    int currentGold = recursiveGold(i, j, k);
                    if (isBenefit(currentGold, k)) {
                        maxGold = Math.max(maxGold, currentGold);
                    }
                }
            }
        }
        System.out.println(maxGold);
    }

    private static boolean isBenefit(int currentGold, int k) {
        int cost = k * k + (k + 1) * (k + 1);
        return (currentGold * M) >= cost;
    }

    private static int recursiveGold(int curX, int curY, int k) {
        if (k < 0) {
            return 0;
        }
        int gold = 0;
        if (visited[curX][curY] != 1 && matrix[curX][curY] == 1){
            gold++;
            visited[curX][curY] = 1;
        }

        for (int i = 0; i < 4; i++) {
            int ny = curY + dy[i];
            int nx = curX + dx[i];
            if (isOutRange(nx, ny)) continue;

            gold += recursiveGold(nx, ny, k - 1);
        }
        return gold;
    }

    private static boolean isOutRange(int x, int y) {
        return x < 0 || x >= N || y < 0 || y >= N;
    }
}