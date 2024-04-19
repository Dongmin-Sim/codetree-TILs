import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;

    public static int[] a;
    public static int[] b;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        a = new int[N];
        b = new int[M];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < N - M + 1; i++) {
            int[] exist = new int[M];
            // a 수열과 b 수열이 같은지
            for (int j = i; j < i+M; j++) {
                int num = a[j];

                for (int k = 0; k < M; k++) {
                    if (exist[k] != 1 && num == b[k]) {
                        exist[k] = 1;
                        break;
                    }
                }
            }
            if (Arrays.stream(exist).sum() == M) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}