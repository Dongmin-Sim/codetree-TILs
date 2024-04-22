import java.util.Scanner;

public class Main {
    public static int N;
    public static int range = 2;

    public static boolean isInRange(int a, int b) {
        return Math.abs(a - b) % (N - range) <= range;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt(), c2 = sc.nextInt();

        int canOpen = 0;
        // 첫번째 자리
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (isInRange(a1, i) && isInRange(b1, j) && isInRange(c1, k)) {
                        canOpen++;
                    } else if (isInRange(a2, i) && isInRange(b2, j) && isInRange(c2, k)) {
                        canOpen++;
                    }
                }
            }
        }
        System.out.println(canOpen);
    }
}