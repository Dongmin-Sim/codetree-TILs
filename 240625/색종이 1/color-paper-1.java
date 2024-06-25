import java.util.Scanner;

public class Main {
    public static int MAX_N = 100;
    public static int[][] matrix = new int[MAX_N + 1][MAX_N + 1];

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            paintRect(sc.nextInt(), sc.nextInt());
        }

        int area = 0;
        for (int i = 0; i < MAX_N; i++) {
            for (int j = 0; j < MAX_N; j++) {
                area += matrix[i][j];
            }
        }
        System.out.println(area);
    }

    public static void paintRect(int x, int y) {
        for (int i = x; i < x+10; i++) {
            for (int j = y; j < y+10; j++) {
                if (matrix[i][j] == 1) {
                    continue;
                }
                matrix[i][j] = 1;
            }
        }
    }
}