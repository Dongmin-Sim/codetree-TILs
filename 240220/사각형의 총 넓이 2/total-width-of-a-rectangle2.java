import java.util.Scanner;

class Rectangle {
    public int x1, y1;
    public int x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {
    public static int MAX = 200;
    public static int OFFSET = 100;
    public static int[][] matrix = new int[MAX + 1][MAX + 1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rectangle r1 = new Rectangle(sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
        Rectangle r2 = new Rectangle(sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);

        for (int i = r1.x1; i < r1.x2; i++) {
            for (int j = r1.y1; j < r1.y2; j++) {
                if (matrix[i][j] != 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = r2.x1; i < r2.x2; i++) {
            for (int j = r2.y1; j < r2.y2; j++) {
                if (matrix[i][j] != 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                result += matrix[i][j];
            }
        }
        System.out.println(result);
    }
}