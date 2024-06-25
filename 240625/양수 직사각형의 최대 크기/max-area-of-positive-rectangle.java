import java.util.Scanner;

public class Main {
    public static int height;
    public static int width;
    public static int[][] matrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();
        matrix = new int[height][width];
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                matrix[h][w] = sc.nextInt();
            }
        }
        // 주어진 매트릭스에서 시작지점을 잡고 모두 완전탐색한다.
        // 시작 지점에서 얼마나 최대 height, width 가져갈지 결정한다.
        // 지점에 음수가 없는지 확인한다.
        // 넓이를 구한다.

        int maxArea = -1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                maxArea = Math.max(maxArea, getMaxArea(new Point(i, j)));
            }
        }
        System.out.println(maxArea);
    }

    public static int getMaxArea(Point start) {
        int maxArea = -1;
        for (int i = start.x; i < height; i++) {
            for (int j = start.y; j < width; j++) {
                Point endPoint = new Point(i, j);
                if (isPositiveRectangle(start, endPoint)) {
                    maxArea = Math.max(maxArea, getArea(start, endPoint));
                }
            }
        }
        return maxArea;
    }

    public static boolean isPositiveRectangle(Point start, Point end) {
        for (int i = start.x; i <= end.x; i++) {
            for (int j = start.y; j <= end.y; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getArea(Point start, Point end) {
        return (end.x - start.x + 1) * (end.y - start.y + 1);
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}