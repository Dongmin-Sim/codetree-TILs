import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minVal = INT_MAX;
        int minCnt = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minCnt = 1;
            } else if (arr[i] == minVal) {
                minCnt++;
            }
        }

        System.out.println(minVal + " " + minCnt);

    }
}