import java.util.Scanner;

public class Main {
    public static int MAX_Q = 100;
    public static int n;
    public static int m;
    public static int q;

    public static int[][] matrix;
    public static int[] row = new int[MAX_Q + 1];
    public static char[] direction = new char[MAX_Q + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < q; i++) {
            row[i] = sc.nextInt()-1;
            direction[i] = sc.next().charAt(0);
        }

        // 전체 iteration = q 만큼
        // (1)row와 d이 주어졌을때, row의 elemnet 들을 한칸씩 이동
        // row를 기준으로 위, 아래 행과 비교하여 동일한 원소가 하나라도 존재하는지 확인 >> 재귀 ?(원소들이 하나도 탈출조건은 같지 않을때)
        // 존재한다면, 반대 Direction 으로 (1) 반복
        // 동일한 원소가 없을때까지 반복

        for (int i = 0; i < q; i++) {
            blowWind(row[i], direction[i]);
        }

        printMatrix();
    }

    private static void blowWind(int row, char c) {
        moveElements(row, c);

        int curRow;
        char nextDir;
        // up propagation

        curRow = row;
        nextDir = c;
        for (int nextRow = row-1; nextRow >= 0; nextRow--) {
            if (isSame(curRow, nextRow)) {
                nextDir = getOtherDir(nextDir);
                moveElements(nextRow, nextDir);
                curRow--;
            } else {
                break;
            }
        }

        // down propagation
        curRow = row;
        nextDir = c;
        for (int nextRow = row+1; nextRow < n; nextRow++) {
            if (isSame(curRow, nextRow)) {
                nextDir = getOtherDir(nextDir);
                moveElements(nextRow, nextDir);
                curRow++;
            } else {
                break;
            }
        }
    }


    public static boolean isSame(int sourceRow, int targetRow) {
        for (int i = 0; i < m; i++) {
            if (matrix[sourceRow][i] == matrix[targetRow][i]) {
                return true;
            }
        }
        return false;
    }

    public static void moveElements(int row, char direction) {
        if (direction == 'L') {
            int temp = matrix[row][m - 1];
            for (int i = m - 1; i > 0; i--) {
                matrix[row][i] = matrix[row][i - 1];
            }
            matrix[row][0] = temp;
        } else {
            int temp = matrix[row][0];
            for (int i = 0; i < m-1; i++) {
                matrix[row][i] = matrix[row][i + 1];
            }
            matrix[row][m-1] = temp;
        }
    }

    private static char getOtherDir(char direction) {
        if (direction == 'L') {
            return 'R';
        } else {
            return 'L';
        }
    }
    private static void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}