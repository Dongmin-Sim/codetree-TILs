import java.util.Scanner;

public class Main {
    public static int n;
    public static final int BLANK = 0;
    public static int[][] matrix;
    public static int bombRow;
    public static int bombCol;
    public static void main(String[] args) {
        setup();
        // (r,c) 위치의 숫자로 폭탄 구현 --> 0으로 만들기
        blowUp(bombRow, bombCol);
        // 중력 적용하기 -->
        // 공중에 떠있는 칸들을 한 칸씩 땡기기
        // n 만큼 같은 col을 만들고 내려주기
        setGravity();
        printMatrix();
    }

    private static void setGravity() {
        for (int col = 0; col < n; col++) {
            int[] temp = new int[n];
            int tempIndex = n-1;
            for (int row = n-1; row >=0; row--) {
                if (matrix[row][col] != BLANK) {
                    temp[tempIndex--] = matrix[row][col];
                }
            }
            for (int row = n-1; row >=0; row--) {
                matrix[row][col] = temp[row];
            }
        }
    }

    private static void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void blowUp(int bombRow, int bombCol) {
        int initBlowUpRange = matrix[bombRow][bombCol];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int blowUpRange = initBlowUpRange;
            int nx = bombRow, ny = bombCol;

            matrix[nx][ny] = 0;
            while (--blowUpRange > 0) {
                nx = nx + dx[i];
                ny = ny + dy[i];
                if (!inRange(nx, ny)) break;
                matrix[nx][ny] = 0;
            }
        }
    }

    public static boolean inRange(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }

    public static void setup() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        bombRow = sc.nextInt()-1;
        bombCol = sc.nextInt()-1;
    }
}