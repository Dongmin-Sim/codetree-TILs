import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int N;

    public static int[][] grid;
    public static int[][] visited;

    // up, down, left, right
    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static ArrayList<Integer> town = new ArrayList<>();

    public static int countPeople = 0;

    private static void DFS(int x, int y) {
        countPeople++;
        visited[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY)) {
                DFS(newX, newY);
            }
        }
    }

    private static boolean canGo(int newX, int newY) {
        return inRange(newX, newY)
                && visited[newX][newY] != 1
                && grid[newX][newY] != 0;
    }

    private static boolean inRange(int newX, int newY) {
        return newX >= 0 && newX < N && newY >= 0 && newY < N;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        grid = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 벽(0)이 아니고, 방문(1)하지 않았을 경우 dfs 실시
                if (canGo(i, j)) {
                    countPeople = 0;
                    DFS(i, j);
                    town.add(countPeople);
                }
            }
        }

        System.out.println(town.size());
        Collections.sort(town);
        for (Integer integer : town) {
            System.out.println(integer);
        }
    }


}