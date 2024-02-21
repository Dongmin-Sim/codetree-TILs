import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int idx = 0;

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 1) {
                arr[idx++] = num + 3;
            } else {
                arr[idx++] = num / 2;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}