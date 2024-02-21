import java.util.Scanner;

public class Main {
    public static int OFFSET = 100;
    public static int MAX = 200;

    public static int[] x1 = new int[MAX + 1];
    public static int[] y1 = new int[MAX + 1];
    public static int[] x2 = new int[MAX + 1];
    public static int[] y2 = new int[MAX + 1];

    public static int[][] matrix = new int[MAX + 1][MAX + 1];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                for (int k = y1[i]; k < y2[i]; k++) {
                    if (i % 2 == 0) {
                        matrix[j][k] = 1;
                    } else {
                        matrix[j][k] = 2;
                    }
                }
            }
        }

        int area = 0;

        for (int i = 0; i <= MAX; i++) {
            for (int j = 0; j <= MAX; j++) {
                if (matrix[i][j] == 2) {
                    area++;
                }
            }
        }
        System.out.println(area);

    }
}