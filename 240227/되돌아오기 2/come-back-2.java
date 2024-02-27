import java.util.Scanner;

public class Main {

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int dirNum = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String instructions = sc.next();

        int x = 0, y = 0;

        for (int i = 0; i < instructions.length(); i++) {
            char direction = instructions.charAt(i);

            if (direction == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } else if (direction == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                x += dx[dirNum];
                y += dy[dirNum];
            }

            if (x == 0 && y == 0) {
                System.out.println(i+1);
                return;
            }
        }

        System.out.println(-1);
    }
}