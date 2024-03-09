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

        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int happySeqNum = 0;

        for (int i = 0; i < n; i++) {
            if (isHappyRowSeq(i)) happySeqNum++;
            if (isHappyColSeq(i)) happySeqNum++;
        }
        System.out.println(happySeqNum);
    }
    private static boolean isHappyColSeq(int col) {
        int prevNum = 0;
        int seqCnt = 1;
        for (int i = 0; i < n; i++) {
            if (seqCnt >= m) {
                return true;
            }

            if (matrix[i][col] == prevNum) {
                seqCnt++;
            } else {
                seqCnt = 1;
            }
            prevNum = matrix[i][col];
        }

        if (seqCnt >= m) return true;
        return false;
    }
    private static boolean isHappyRowSeq(int row) {
        int prevNum = 0;
        int seqCnt = 1;
        for (int i = 0; i < n; i++) {
            if (seqCnt >= m) {
                return true;
            }

            if (matrix[row][i] == prevNum) {
                seqCnt++;
            } else {
                seqCnt = 1;
            }
            prevNum = matrix[row][i];
        }

        if (seqCnt >= m) return true;
        return false;
    }
}