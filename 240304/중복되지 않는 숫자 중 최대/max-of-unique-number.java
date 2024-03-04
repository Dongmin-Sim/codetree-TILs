import java.util.Scanner;

public class Main {
    public static int MAX = 1000;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;

        for (int i = 0; i < n; i++) {
            int maxCandidate = arr[i];

            if (max < maxCandidate) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == maxCandidate) {
                        cnt++;
                    }
                }

                if (cnt == 1) {
                    max = maxCandidate;
                }
            }
        }
        System.out.println(max);
    }
}