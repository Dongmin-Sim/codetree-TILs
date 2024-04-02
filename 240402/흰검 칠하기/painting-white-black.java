import java.util.Scanner;

public class Main {

    public static int MAX_N = 1000;
    public static int MAX_X = 100;
    public static int[] whiteCount = new int[MAX_X * MAX_N];
    public static int[] blackCount = new int[MAX_X * MAX_N];
    public static char[] tiles = new char[MAX_X * MAX_N];
    public static int currPos = (MAX_X * MAX_N) / 2;

    public static void paintLeft(int step) {
        whiteCount[currPos]++;
        tiles[currPos] = 'w';

        for (int i = 0; i < step-1; i++) {
            currPos--;
            whiteCount[currPos]++;
            tiles[currPos] = 'w';
        }
    }

    public static void paintRight(int step) {
        blackCount[currPos]++;
        tiles[currPos] = 'b';

        for (int i = 0; i < step-1; i++) {
            currPos++;
            blackCount[currPos]++;
            tiles[currPos] = 'b';
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int step = sc.nextInt();
            String dir = sc.next();

            if (dir.equals("R")) {
                paintRight(step);
            } else {
                paintLeft(step);
            }
        }

        int white = 0, black = 0, gray = 0;
        for (int i = 0; i < MAX_N * MAX_X; i++) {
            if (whiteCount[i] >= 2 && blackCount[i] >= 2){
                gray++;
                continue;
            }

            if (tiles[i] == 'b') {
                black++;
            } else if (tiles[i] == 'w') {
                white++;
            }
        }
        System.out.println(white + " " + black + " " + gray);
    }


}