import java.util.Scanner;

public class Main {

    public static int[][] matrix;

    public static int n;
    public static int m;

    public static int dirNum = 0;

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        matrix = new int[n][m];

        int x = 0, y = 0;
        matrix[x][y] = 1;

        int idx = 2;
        for (int i = 2; idx <= n * m; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (inRange(nx, ny) && matrix[nx][ny] == 0) {
                matrix[nx][ny] = idx++;
                x = nx;
                y = ny;
            } else {
                dirNum = (dirNum + 1) % 4;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}