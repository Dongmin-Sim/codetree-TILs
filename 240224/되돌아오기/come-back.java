import java.util.Scanner;

public class Main {
    public static int dirNum = 0;


    // N:0 E:1 S:2 W:3
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};


    public static int getDirNum(char dir) {
        if (dir == 'N') {
            return 0;
        } else if (dir == 'E') {
            return 1;
        } else if (dir == 'S') {
            return 2;
        } else {
            return 3;
        }

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cx = 0, cy = 0;
        int time = 0;
        for (int i = 0; i < n; i++) {
            int dir = getDirNum(sc.next().charAt(0));
            int step = sc.nextInt();

            for (int j = 0; j < step; j++) {
                cx = cx + dx[dir];
                cy = cy + dy[dir];

                time++;

                if (cx == 0 && cy == 0) {
                    System.out.println(time);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}