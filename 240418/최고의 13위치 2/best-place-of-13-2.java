import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int max = -1;

        // 첫번째 격자
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < n-2; y1++) {
                // 두번째 격자
                for (int x2 = 0; x2 < n; x2++) {
                    for (int y2 = 0; y2 < n - 2; y2++) {
                        if (x1 == x2 && Math.abs(y1 - y2) <= 2) {
                            continue;
                        }

                        int cnt1 = grid[x1][y1] + grid[x1][y1 + 1] + grid[x1][y1 + 2];
                        int cnt2 = grid[x2][y2] + grid[x2][y2 + 1] + grid[x2][y2 + 2];

                        max = Math.max(max, (cnt1 + cnt2));
                    }
                }
            }
        }
        System.out.println(max);
    }
}