import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;

        int idx = 2;
        int temp = 0;
        while (true) {
            if (temp > 100) {
                break;
            }
            temp = arr[idx - 1] + arr[idx - 2];
            arr[idx++] = temp;
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}