import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        double avg = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if ((i+1) % 2 == 0) {
                sum += arr[i];
            }
            if ((i + 1) % 3 == 0) {
                avg += arr[i];
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum, avg/cnt);
    }
}