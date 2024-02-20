import java.util.Scanner;

public class Main {
    public static int LENGTH = 8;
    public static int OFFSET = 100;
    public static int MAX = 200;
    public static int[] x;
    public static int[] y;
    public static int[][] matrix = new int[MAX + 1][MAX + 1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        x = new int[n];
        y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + OFFSET;
            y[i] = sc.nextInt() + OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int j = x[i]; j < x[i] + LENGTH; j++) {
                for (int k = y[i]; k < y[i] + LENGTH; k++) {
                    if (matrix[j][k] != 1) {
                        matrix[j][k] = 1;
                    }
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                cnt += matrix[i][j];
            }
        }
        System.out.println(cnt);
    }
}