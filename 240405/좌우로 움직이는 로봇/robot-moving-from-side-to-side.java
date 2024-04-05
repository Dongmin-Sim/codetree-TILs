import java.util.Scanner;

public class Main {
    public static int MAX = 50000*50000;

    public static int[] moveA = new int[MAX];
    public static int[] moveB = new int[MAX];

    public static int sec = 0;
    public static int cur = 0;

    public static int totalASec = 0;
    public static int totalBSec = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int step = sc.nextInt();
            totalASec += step;
            String dir = sc.next();

            for (int j = 0; j < step; j++) {
                if (dir.equals("R")) {
                    moveA[++sec] = ++cur;
                } else {
                    moveA[++sec] = --cur;
                }
            }
        }

        sec = 0;
        cur = 0;

        for (int i = 0; i < m; i++) {
            int step = sc.nextInt();
            totalBSec += step;
            String dir = sc.next();

            for (int j = 0; j < step; j++) {
                if (dir.equals("R")) {
                    moveB[++sec] = ++cur;
                } else {
                    moveB[++sec] = --cur;
                }
            }
        }

        int count = 0;

        int a = 1, b = 1;
        int prevA = 0, prevB = 0;
        while ((a < totalASec) || (b < totalBSec)) {
            if (moveA[a] == moveB[b] && prevA != prevB) {
                count++;
            }

            prevA = moveA[a];
            prevB = moveB[b];

            if (a < totalASec) a++;
            if (b < totalBSec) b++;
        }
        System.out.println(count);

        // [0, -1, -2, -3, -2, -1, 0, 1, 2, 1, 2, 3,
        // [0, 1,  2,  3,  4,  3,  2, 1, 0, 1, 2, 3, 4, 3, 2,
    }
}