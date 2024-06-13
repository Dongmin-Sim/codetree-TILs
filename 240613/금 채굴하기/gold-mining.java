import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;

    public static int[][] matrix;

    public static int getGold(int x, int y, int k) {
        int gold = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Math.abs(x - i) + Math.abs(y - j) <= k) {
                    if (matrix[i][j] == 1) gold++;
                }
            }
        }
        return gold;
    }

    public static int getCost(int k) {
        return k * k + (k + 1) * (k + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxGold = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    int curGold = getGold(i, j, k);

                    if (curGold * M >= getCost(k)) {
                        maxGold = Math.max(maxGold, curGold);
                    }
                }
            }
        }
        System.out.println(maxGold);
    }
}