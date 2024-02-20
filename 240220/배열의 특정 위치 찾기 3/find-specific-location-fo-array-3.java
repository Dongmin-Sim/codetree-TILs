import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int result = 0;

        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                arr[i] = num;
            } else {
                result = arr[i-1] + arr[i-2] + arr[i-3];
            }
        }
        System.out.println(result);
    }
}