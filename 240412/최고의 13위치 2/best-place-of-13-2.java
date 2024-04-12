import java.util.Scanner;

public class Main {
    public static int N;

    public static int[][] grid;

    public static int maxCoins = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int coin = 0;

        int mx = 0, my = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 2; j++) {
                int coins = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                if (maxCoins < coins) {
                    maxCoins = coins;
                    mx = i;
                    my = j;
                }
            }
        }
        coin += maxCoins;
        maxCoins = 0;
        int mx2 = 0, my2 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 2; j++) {
                if ((mx == i && my == j) || my + 1 == j || my + 2 == j) {
                    continue;
                }
                int coins = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                if (maxCoins < coins) {
                    maxCoins = coins;
                    mx2 = i;
                    my2 = j;
                }
            }
        }
        coin += maxCoins;
        System.out.println(coin);
    }
}