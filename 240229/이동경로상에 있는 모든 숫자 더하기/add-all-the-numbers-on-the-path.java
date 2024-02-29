import java.util.Scanner;

public class Main {

    public static int n;
    public static int[][] matrix;

    public static int dirNum = 0;
    public static int[] dx = new int[]{-1, 0, 1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        String instruction = sc.next();
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = n / 2;
        int y = n / 2;

        int total = matrix[x][y];

        for (int i = 0; i < t; i++) {
            char inst = instruction.charAt(i);


            if (inst == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;

            } else if (inst == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if (!inRange(nx, ny)) {
                    continue;
                } else {
                    total += matrix[nx][ny];
                    x = nx;
                    y = ny;
                }
            }
        }
        System.out.println(total);

    }
}