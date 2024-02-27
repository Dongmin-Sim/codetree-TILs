import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < 5; i++) {
            matrix[i][0] = 1;
            matrix[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n ; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[i][j - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}