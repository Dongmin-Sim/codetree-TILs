import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int temp = 0;
            for (int j = 0; j < k; j++) {
                temp += arr[i+j];
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }
}