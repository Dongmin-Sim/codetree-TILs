import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] matrix;

    public static int[] dx = new int[]{-1, 0, 1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};
    public static void paintArea(int x, int y) {
        if (inRange(x, y)) {
            matrix[x][y] = 1;
        }
    }

    public static boolean checkComfortArea(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny) && matrix[nx][ny]==1) {
                cnt++;
            }
        }

        return cnt == 3;
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        matrix = new int[n][n];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt()-1, y = sc.nextInt()-1;

            paintArea(x, y);

            if (checkComfortArea(x, y)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}