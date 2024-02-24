import java.util.Scanner;

public class Main {
    public static int dirNum = 0;

    // U R L D
    public static int[] dx = new int[]{-1, 0, 0, 1};
    public static int[] dy = new int[]{0, 1, -1, 0};

    public static boolean inRange(int n, int nx, int ny) {
        return (nx >= 0 && nx < n && ny >= 0 && ny < n);
    }

    public static int changeDirToNum(char direction) {
        if (direction == 'U') {
            return 0;
        } else if (direction == 'D') {
            return 3;
        } else if (direction == 'R') {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int cx = sc.nextInt()-1, cy = sc.nextInt()-1;
        dirNum = changeDirToNum(sc.next().charAt(0));

        while (t > 0) {
            int nx = cx, ny = cy;
            nx += dx[dirNum];
            ny += dy[dirNum];

            if (!inRange(n, nx, ny)) {
                dirNum = 3 - dirNum;
                t--;
                continue;
            }

            cx += dx[dirNum];
            cy += dy[dirNum];
            t--;
        }
        System.out.println((cx+1) + " " + (cy+1));
    }
}