import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000;
    public static int MAX = 2000;

    public static int[][] matrix = new int[MAX + 1][MAX + 1];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int r1X1 = sc.nextInt() + OFFSET;
        int r1Y1 = sc.nextInt() + OFFSET;
        int r1X2 = sc.nextInt() + OFFSET;
        int r1Y2 = sc.nextInt() + OFFSET;

        int r2X1 = sc.nextInt() + OFFSET;
        int r2Y1 = sc.nextInt() + OFFSET;
        int r2X2 = sc.nextInt() + OFFSET;
        int r2Y2 = sc.nextInt() + OFFSET;

        for (int i = r1X1; i < r1X2; i++) {
            for (int j = r1Y1; j < r1Y2; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = r2X1; i < r2X2; i++) {
            for (int j = r2Y1; j < r2Y2; j++) {
                matrix[i][j] = 0;
            }
        }

        int cnt = 0;
        int minX=MAX, maxX = 0;
        int minY=MAX, maxY = 0;
        for (int i = 0; i <= MAX; i++) {
            for (int j = 0; j <= MAX; j++) {
                if (matrix[i][j] == 1) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);

                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                    cnt++;
                }
            }
        }
        if (cnt == 0) {
            System.out.println(0);
        }else {
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        }

    }
}