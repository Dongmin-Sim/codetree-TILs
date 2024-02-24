import java.util.Scanner;

public class Main {
    public static int[][] matrix;
    public static int dirNum = 0;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
    public static int n;
    public static int m;

    public static boolean inRange(int nx, int ny) {
        return (0 <= nx && nx < n && 0 <= ny && ny < m);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        matrix = new int[n][m];

        int cx = 0, cy = 0;
        matrix[cx][cy] = 1;

        for (int i = 1; i < n*m; i++) {
            int nx = cx + dx[dirNum], ny = cy + dy[dirNum];

            if (!inRange(nx, ny) || matrix[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            cx += dx[dirNum];
            cy += dy[dirNum];
            matrix[cx][cy] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}