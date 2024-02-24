import java.util.Scanner;

public class Main {
    public static int[][] matrix;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = 0;
                
                for (int k = 0; k < 4; k++) {
                    int nx = i, ny = j;
                    nx += dx[k];
                    ny += dy[k];

                    if (inRange(n, nx, ny) && matrix[nx][ny] == 1) {
                        temp++;
                    }
                }
                if (temp >= 3) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    public static boolean inRange(int n, int nx, int ny) {
        return (nx >= 0 && nx < n && ny >= 0 && ny < n);
    }
}