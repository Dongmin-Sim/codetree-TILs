import java.util.Scanner;

public class Main {

    public static int N;

    public static int[][] grid;
    public static int[][] visited;

    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static int blowUpBlockNum = 0;
    public static int maxBlockNum = 0;
    public static int blockNum = 0;

    public static void DFS(int x, int y) {
        int curVal = grid[x][y];
        visited[x][y] = 1;
        blockNum++;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY, curVal)) {
                DFS(newX, newY);
            }
        }
    }

    public static boolean canGo(int x, int y, int curVal) {
        return inRange(x, y)
                && grid[x][y] == curVal
                && visited[x][y] != 1;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        grid = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (inRange(i, j) && visited[i][j] != 1) {
                    DFS(i, j);
                }
                if (blockNum >= 4) {
                    blowUpBlockNum++;
                }
                maxBlockNum = Math.max(maxBlockNum, blockNum);
                blockNum = 0;
            }
        }

        System.out.println(blowUpBlockNum + " " + maxBlockNum);
    }
}