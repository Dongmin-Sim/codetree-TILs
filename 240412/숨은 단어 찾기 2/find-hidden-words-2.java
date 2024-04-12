import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;
    public static char[][] grid;

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        grid = new char[N][M];

        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            for (int j = 0; j < M; j++) {
                grid[i][j] = temp.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                cnt += isLee(i, j);
            }
        }
        System.out.println(cnt);
    }

    private static int isLee(int cx, int cy) {
        int[] dx = new int[]{-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dy = new int[]{0, 0, -1, 1, -1, 1, 1, -1};

        if (grid[cx][cy] != 'L') {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < 8; i++) {
            int cnt = 1;

            int nx = cx + dx[i];
            int ny = cy + dy[i];

            for (int j = 0; j < 2; j++) {
                if (inRange(nx, ny) && grid[nx][ny] == 'E') {
                    cnt++;
                } else {
                    break;
                }
                nx += dx[i];
                ny += dy[i];
            }
            if (cnt == 3) result++;
        }

        return result;
    }
}