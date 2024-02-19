import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            if (temp >= 250) {
                break;
            }
            arr[i] = temp;
            cnt++;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("%d %.1f", sum, ((double)sum / cnt));
    }
}