import java.util.Scanner;

public class Main {
    public static int n;

    public static int dirNum = 0;

    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{-1, 0, 1, 0};

    public static int[][] matrix;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        matrix = new int[n][n];

        int idx = n*n;
        int x = n-1;
        int y = n-1;

        matrix[x][y] = idx--;

        while (idx > 1) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            // 방향 변경 조건
            if (inRange(nx, ny) && matrix[nx][ny] == 0) {
                matrix[nx][ny] = idx--;
                x = nx;
                y = ny;
            } else {
                dirNum = (dirNum + 1) % 4;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}