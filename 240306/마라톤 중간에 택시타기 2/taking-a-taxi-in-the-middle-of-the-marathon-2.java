import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {
    public static int[] x;
    public static int[] y;


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = new int[100];
        y = new int[100];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < n-1; i++) {
            int tempDist = 0;
            for (int j = 1; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (i + 1 == j) {
                    tempDist += getManhattanDist(x[j], y[j], x[i - 1], y[i - 1]);
                } else {
                    tempDist += getManhattanDist(x[j], y[j], x[j-1], y[j-1]);
                }
            }
            minDist = Math.min(minDist, tempDist);
        }
        System.out.println(minDist);

    }

    public static int getManhattanDist(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}