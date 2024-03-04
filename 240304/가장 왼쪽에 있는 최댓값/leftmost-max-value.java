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

        int cnt = 0;
        int[] idxArr = new int[n];

        idxArr[cnt++] = 0;

        for (int i = 1; i < n; i++) {
            int lastIdx = idxArr[cnt - 1];
            if (arr[i] > arr[lastIdx]) {
                idxArr[cnt++] = i;
            }
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print((idxArr[i] + 1) + " ");
        }
    }
}