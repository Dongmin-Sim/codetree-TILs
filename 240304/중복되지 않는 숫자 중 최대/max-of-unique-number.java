import java.util.Arrays;
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
        Arrays.sort(arr);

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                max = -1;
            } else {
                max = Math.max(max, arr[i]);
            }
        }

        System.out.println(max);

    }
}