import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nx = 0, ny = 0;
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int step = sc.nextInt();

            for (int j = 0; j < step; j++) {
                if (dir == 'E') {
                    nx += dx[0];
                    ny += dy[0];
                } else if (dir == 'W') {
                    nx += dx[1];
                    ny += dy[1];
                } else if (dir == 'S') {
                    nx += dx[2];
                    ny += dy[2];
                } else {
                    nx += dx[3];
                    ny += dy[3];
                }
            }

        }
        System.out.println(nx + " " + ny);

    }
}