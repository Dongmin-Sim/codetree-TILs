import java.util.Scanner;

public class Main {
    public static int[] x;
    public static int[] y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        x = new int[n];
        y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int x1 = x[i], x2 = x[j];
                int y1 = y[i], y2 = y[j];

                int dist = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                minDist = Math.min(minDist, dist);
            }
        }
        System.out.println(minDist);
    }

}