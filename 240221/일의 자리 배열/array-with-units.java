import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] arr = new int[11];

        arr[1] = a;
        arr[2] = b;

        for (int i = 3; i < 11; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 1; i < 11; i++) {
            System.out.print(arr[i] % 10 + " ");
        }
    }
}