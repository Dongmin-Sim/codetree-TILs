import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] <= t) {
                cnt = 0;
            } else {
                cnt++;
            }

            result = Math.max(result, cnt);
        }

        System.out.println(result);
    }
}