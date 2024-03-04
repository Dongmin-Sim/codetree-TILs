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

        int maxUnder500 = Integer.MIN_VALUE;
        int minOver500 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 500) {
                maxUnder500 = Math.max(maxUnder500, arr[i]);
            } else {
                minOver500= Math.min(minOver500, arr[i]);
            }
        }

        System.out.println(maxUnder500 + " " + minOver500);
    }
}