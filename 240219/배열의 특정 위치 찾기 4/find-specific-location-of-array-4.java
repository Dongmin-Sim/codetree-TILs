import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp == 0) {
                break;
            }

            arr[cnt++] = temp;
        }

        int doubleCnt = 0;
        int doubleSum = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] % 2 == 0) {
                doubleCnt++;
                doubleSum += arr[i];
            }
        }
        System.out.printf("%d %d", doubleCnt, doubleSum);
    }
}