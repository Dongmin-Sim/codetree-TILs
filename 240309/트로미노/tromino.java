import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[][] matrix;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int typeANum = getTypeABlock();
        int typeBNum = getTypeBBlock();

        System.out.println(Math.max(typeANum, typeBNum));
    }
    private static int getTypeABlock() {
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 >= n) {
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (j + 1 >= m) {
                    continue;
                }

                int total = getTotalNums(i, i + 1, j, j + 1);

                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        maxNum = Math.max(maxNum, total- matrix[i+k][j+l]);
                    }
                }
            }
        }

        return maxNum;
    }

    public static int getTotalNums(int rowS, int rowE, int colS, int colE) {
        int total = 0;
        for (int i = rowS; i <= rowE; i++) {
            for (int j = colS; j <= colE; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }

    private static int getTypeBBlock() {
        int maxNum = 0;

        for (int i = 0; i < n; i++) {
            if (i + 2 >= n) {
                continue;
            }

            for (int j = 0; j < m; j++) {
                maxNum = Math.max(maxNum, getTotalNums(i, i + 2, j, j));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 >= m) {
                    continue;
                }
                maxNum = Math.max(maxNum, getTotalNums(i, i, j, j + 2));
            }
        }

        return maxNum;
    }

}