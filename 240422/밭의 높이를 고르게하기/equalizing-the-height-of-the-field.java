import java.util.Scanner;

public class Main {
    public static int N, H, T;
    public static int[] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        T = sc.nextInt();

        grid = new int[N];
        for (int i = 0; i < N; i++) {
            grid[i] = sc.nextInt();
        }

        // 시작 지점
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i <= N-T; i++) {
            int cost = 0;
            for (int j = 0; j < T; j++) {
                cost += Math.abs(grid[i + j] - H);
            }
            minCost = Math.min(minCost, cost);
        }
        System.out.println(minCost);
    }
}