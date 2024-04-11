import java.util.Scanner;

public class Main {
    public static int N = 19;
    public static int M = 5;

    public static int BLACK = 1;
    public static int WHITE = 2;
    public static int BLANK = 0;

    public static int winner = 0;
    public static int wx = 0;
    public static int wy = 0;

    public static int[][] grid = new int[N][N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int cur = grid[i][j];
                if (cur != 0 && isWinning(i, j, cur)) {
                    winner = cur;
                }
            }
        }


        // print result
        System.out.println(winner);
        if (winner != 0) {
            System.out.println((wx+1) + " " + (wy+1));
        }
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
    private static boolean isWinning(int cx, int cy, int cur) {
        // check 상하좌우, 대각선
        int[] dx = new int[]{-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = new int[]{0, 0, -1, 1, -1, 1, -1, 1};

        int cnt = 1;
        for (int k = 0; k < 8; k++) {
            int nx = cx + dx[k];
            int ny = cy + dy[k];
            for (int l = 0; l < 4; l++) {
                if (inRange(nx, ny) && grid[nx][ny] == cur) {
                    if (++cnt == M) {
                        wx = (cx + nx) / 2;
                        wy = (cy + ny) / 2;
                        return true;
                    }
                } else {
                    break;
                }
                nx += dx[k];
                ny += dy[k];
            }

            cnt = 1;
        }
        return false;
    }
}