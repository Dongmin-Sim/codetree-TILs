import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;

    private final static int[] dx = new int[]{1, -1, 0, 0};
    private final static int[] dy = new int[]{0, 0, -1, 1};

    private static int[][] matrix;
    private static int[][] visited;

    private static Queue<Pair> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxGold = 0;

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    visited = new int[N][N];
                    queue.add(new Pair(i, j, k));

                    int currentGold = bfsGold();
                    if (isBenefit(currentGold, k)) {
                        maxGold = Math.max(maxGold, currentGold);
                    }
                }
            }
        }
        System.out.println(maxGold);
    }

    private static boolean isBenefit(int currentGold, int k) {
        int cost = k * k + (k + 1) * (k + 1);
        return (currentGold * M) >= cost;
    }

    private static int bfsGold() {
        int gold = 0;

        while (!queue.isEmpty()) {
            Pair curP = queue.poll();
            int x = curP.getX();
            int y = curP.getY();
            int k = curP.getK();

            if (k < 0) continue;
            if (visited[x][y] == 0 && matrix[x][y] == 1){
                gold++;
            }
            visited[x][y] = 1;



            for (int i = 0; i < 4; i++) {
                int nx = curP.getX() + dx[i];
                int ny = curP.getY() + dy[i];
                if (!isOutRange(nx, ny) && visited[nx][ny] == 0){
                    queue.add(new Pair(nx, ny, curP.getK() - 1));
                }
            }
        }

        return gold;
    }
    private static boolean isOutRange(int x, int y) {
        return x < 0 || x >= N || y < 0 || y >= N;
    }

    public static class Pair {

        int x;
        int y;
        int k;
        public Pair(int x, int y, int k) {
            this.x = x;
            this.y = y;
            this.k = k;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }

    }
}