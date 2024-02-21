import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) { // 바뀌는 조건
                // TODO 이전 동일한 횟수 중 최댓값 갱신
                result = Math.max(result, cnt);
                cnt = 1;
            } else {
                // TODO 이전 동일한 횟수 계산
                cnt++;
            }
        }

        System.out.println(result);
    }
}