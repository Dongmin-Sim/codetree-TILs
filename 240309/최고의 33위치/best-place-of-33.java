import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] matrix;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxCoin = 0;

        for (int i = 0; i < n; i++) {
            if (i + 2 >= n) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (j + 2 >= n) {
                    continue;
                }
                maxCoin = Math.max(maxCoin, getCoinNums(i,i+2, j, j + 2));
            }
        }

        System.out.println(maxCoin);
    }

    private static int getCoinNums(int rowS, int rowE, int colS, int colE) {
        int coin = 0; 
        for (int i = rowS; i <= rowE; i++) {
            for (int j = colS; j <= colE; j++) {
                coin += matrix[i][j];
            }    
        }
        return coin;
    }
}