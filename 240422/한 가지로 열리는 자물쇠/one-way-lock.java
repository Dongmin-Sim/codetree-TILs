import java.util.Scanner;

public class Main {
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int notOpen = 0;
        // 첫번째 자리
        for (int i = 1; i <= N; i++) {
            // 두번째 자리
            for (int j = 1; j <= N; j++) {
                // 세번째 자리
                for (int k = 1; k <= N; k++) {
                    if (Math.abs(a - i) > 2 && Math.abs(b - j) > 2 && Math.abs(c - k) > 2) {
                        notOpen++;
                    }
                }
            }
        }
        System.out.println(N*N*N - notOpen);
    }
}