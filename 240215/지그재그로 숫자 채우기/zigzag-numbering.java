import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] matrix = new int[n][m];

        int num = 0;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 1) {
                for (int j = n-1; j >= 0; j--) {
                    matrix[j][i] = num++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}