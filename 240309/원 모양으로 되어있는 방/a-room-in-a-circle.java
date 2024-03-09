import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minDist = Math.min(minDist, getDist(i));
        }
        System.out.println(minDist);
    }
    private static int getDist(int i) {
        int total = 0;
        int multiply = 1;
        for (int j = i; j < i + n; j++) {
            if (j == i) {
                continue;
            }
            total += arr[j % n] * (multiply++);
        }

        return total;
    }
}