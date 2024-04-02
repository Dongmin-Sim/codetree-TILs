import java.util.Scanner;

public class Main {
    public static int MAX_K = 1000 * 100;

    public static char[] tiles = new char[2 * MAX_K + 1];
    public static int cur;
    public static void paint(int step, char dir) {
        char color = dir == 'L' ? 'w' : 'b';
        tiles[cur] = color;

        for (int i = 0; i < step - 1; i++) {
            if (dir == 'L') {
                cur--;
            } else {
                cur++;
            }
            tiles[cur] = color;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        cur = MAX_K;
        for (int i = 0; i < n; i++) {
            int step = sc.nextInt();
            char dir = sc.next().charAt(0);
            paint(step, dir);
        }

        int white = 0, black = 0;
        for (int i = 0; i < 2 * MAX_K + 1; i++) {
            if (tiles[i] == 'w') {
                white++;
            } else if (tiles[i] == 'b'){
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}