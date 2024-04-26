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

        // 한번은 x축에 평행하고 && 다른 한변은 y축에 평행한 삼각형의 조건
        // x 축에 평행 : (x1, y1), (x2, y2) 일때, y1-y2 == 0
        // y 축에 평행 : (x1, y1), (x2, y2) 일때, x1-x2 == 0

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {

                    int x1 = x[i], x2 = x[j], x3 = x[k];
                    int y1 = y[i], y2 = y[j], y3 = y[k];

                    boolean parallelX = (y1 - y2 == 0 || y2 - y3 == 0 | y1 - y3 == 0);
                    boolean parallelY = (x1 - x2 == 0 || x2 - x3 == 0 | x1 - x3 == 0);
                    if (parallelX && parallelY) {
                        // 셋다 같은 점이 아니라면
                        if (!((x2 == x3 && x3 == x1) && (y2 == y3 && y3 == y1))) {
                            // 넓이 구하기
                            int area = Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3)) / 2;
                            maxArea = Math.max(maxArea, area);
                        }
                    }
                }
            }
        }
        System.out.println(maxArea * 2);
    }
}