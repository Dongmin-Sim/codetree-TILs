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

        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int distanceTotal = 0;

            for (int j = 0; j < n; j++) {
                int abs = Math.abs(i - j);
                distanceTotal += (abs * arr[j]);
            }

            if (minDis > distanceTotal) {
                minDis = distanceTotal;
            }
        }

        System.out.println(minDis);
    }
}