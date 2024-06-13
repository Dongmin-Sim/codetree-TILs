import java.util.Scanner;

public class Main {
    public static int N;

    public static int[] dx = new int[]{0, -1, -1, 1, 1};
    public static int[] dy = new int[]{0, 1, -1, -1, 1};

    public static int[][] matrix;

    public static int getRect(int sx, int sy, int leftLength, int rightLength) {
        int result = 0;
        // 1번 방향 with
        for (int k = 0; k < leftLength; k++) {
            sx += dx[1];
            sy += dy[1];
            if (!inRange(sx, sy)) {
                return 0;
            }
            result += matrix[sx][sy];
        }
        // 2번 방향
        for (int k = 0; k < rightLength; k++) {
            sx += dx[2];
            sy += dy[2];
            if (!inRange(sx, sy)) {
                return 0;
            }
            result += matrix[sx][sy];
        }

        // 3번 방형
        for (int k = 0; k < leftLength; k++) {
            sx += dx[3];
            sy += dy[3];
            if (!inRange(sx, sy)) {
                return 0;
            }
            result += matrix[sx][sy];
        }

        // 4번 방향
        for (int k = 0; k < rightLength; k++) {
            sx += dx[4];
            sy += dy[4];
            if (!inRange(sx, sy)) {
                return 0;
            }
            result += matrix[sx][sy];
        }

        return result;
    }

    private static boolean inRange(int cx, int cy) {
        return cx >= 0 && cx < N && cy >= 0 && cy < N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxRect = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 1; k <= N-2; k++) {
                    for (int l = 1; l <= N-2; l++) {
                        maxRect = Math.max(maxRect, getRect(i, j, k, l));
                    }
                }
            }
        }
        System.out.println(maxRect);
    }
}