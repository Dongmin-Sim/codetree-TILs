import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int totalCandy = 0;
        for (int i = 0; i < n; i++) {
            int candy = sc.nextInt();
            arr[sc.nextInt()] += candy;
            totalCandy += candy;
        }

        if (k >= 50) {
            System.out.println(totalCandy);
            return;
        }

        int max = 0;
        for (int i = 0; i < 100 - 2 * k; i++) {
            int temp = 0;
            for (int j = i; j <= i+ (2 * k); j++) {
                temp += arr[j];
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);

    }
}