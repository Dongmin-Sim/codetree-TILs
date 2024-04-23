import java.util.Scanner;

public class Main {

    public static int MAX = 40000;
    public static int MIN = 0;
    public static int[][] segments;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        segments = new int[n][2];

        for (int i = 0; i < n; i++) {
            segments[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        // 제외할 대상
        int minArea = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // 최대 가로 - 최소 가로
            int maxWidth = MIN, minWidth = MAX;
            // 최대 세로 - 최소 세로
            int maxHeight = MIN, minHeight = MAX;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int x = segments[j][0], y = segments[j][1];
                maxWidth = Math.max(maxWidth, x);
                minWidth = Math.min(minWidth, x);

                maxHeight = Math.max(maxHeight, y);
                minHeight = Math.min(minHeight, y);
            }

            int tempArea = (maxWidth - minWidth) * (maxHeight - minHeight);
            minArea = Math.min(minArea, tempArea);
        }
        System.out.println(minArea);
    }
}