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

        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }

        System.out.println(even > odd ? even - odd : odd - even);
    }
}