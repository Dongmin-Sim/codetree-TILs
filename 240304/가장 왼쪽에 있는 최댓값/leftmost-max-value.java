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

        int idx = n;

        while (true) {
            int max = Integer.MIN_VALUE;
            int tempIdx = 0;
            for (int i = 0; i < idx; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    tempIdx = i;
                }
            }
            if (tempIdx == 0) {
                System.out.print(1);
                break;
            }
            System.out.print(tempIdx + 1 + " ");
            idx = tempIdx;
        }

    }
}