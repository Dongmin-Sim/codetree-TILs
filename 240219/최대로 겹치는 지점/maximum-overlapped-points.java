import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100+1];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}