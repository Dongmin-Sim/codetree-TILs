import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] even = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[idx++] = arr[i];
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(even[i]);
        }
    }
}