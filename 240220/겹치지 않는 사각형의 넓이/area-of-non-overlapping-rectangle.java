import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000;
    public static int MAX = 2000;
    public static int[][] matrix = new int[MAX + 1][MAX + 1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        addRect(
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET
        );
        addRect(
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET
        );
        subRect(
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET,
                sc.nextInt() + OFFSET
        );

        int cnt = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                cnt += matrix[i][j];
            }
        }
        System.out.println(cnt);
    }

    public static void addRect(int x1, int y1, int x2, int y2) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (matrix[i][j] != 1) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void subRect(int x1, int y1, int x2, int y2) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}