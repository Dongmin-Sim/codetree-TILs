import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int id, x, y;

    public Point(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return (Math.abs(x) + Math.abs(y)) - (Math.abs(o.x) + Math.abs(o.y));
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(i + 1, sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(points);

        for (int i = 0; i < n; i++) {
            System.out.println(points[i].id);
        }
    }
}