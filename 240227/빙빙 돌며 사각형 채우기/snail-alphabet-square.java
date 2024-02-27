import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int dirNum = 0;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int[][] matrix;
//    public static int A = 65;

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
        int alphabet = 1;

        matrix[x][y] = alphabet++;
        int cnt = 1;
        while (cnt < n*m) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if (inRange(nx, ny) && matrix[nx][ny] == 0) {
                matrix[nx][ny] = alphabet++;
                x = nx;
                y = ny;
                cnt++;
            } else {
                dirNum = (dirNum + 1) % 4;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((char)((matrix[i][j]-1) % 26 + 65) + " ");
            }
            System.out.println();
        }
    }
}