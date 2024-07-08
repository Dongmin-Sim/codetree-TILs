import java.util.Scanner;

public class Main {
    public static final int MAX_N = 4;
    public static int n = 4;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[][] nextGrid = new int[MAX_N][MAX_N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        char dirChar = sc.next().charAt(0);

        int[] dirMapper = new int[128];
        dirMapper['D'] = 0;
        dirMapper['R'] = 1;
        dirMapper['U'] = 2;
        dirMapper['L'] = 3;

        tilt(dirMapper[dirChar]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void tilt(int moveDir) {
        for (int i = 0; i < moveDir; i++) rotate();
        drop();
        for (int i = 0; i < 4 - moveDir; i++) rotate();
    }

    private static void drop() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nextGrid[i][j] = 0;
            }
        }

        for (int j = 0; j < n; j++) {
            int keepNum = -1, nextRow = n-1;
            for (int i = n-1; i >= 0; i--) {
                if (grid[i][j] == 0) continue;
                if (keepNum == -1) keepNum = grid[i][j];
                else if (keepNum == grid[i][j]) {
                    nextGrid[nextRow--][j] = keepNum * 2;
                    keepNum = -1;
                } else {
                    nextGrid[nextRow--][j] = keepNum;
                    keepNum = grid[i][j];
                }
            }
            if (keepNum != -1) {
                nextGrid[nextRow--][j] = keepNum;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = nextGrid[i][j];
            }
        }
    }

    public static void rotate(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nextGrid[i][j] = 0;
            }
        }

        // 90' 회전
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nextGrid[i][j] = grid[n-j-1][i];
            }
        }

        // 다시 옮기기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = nextGrid[i][j];
            }
        }
    }


}