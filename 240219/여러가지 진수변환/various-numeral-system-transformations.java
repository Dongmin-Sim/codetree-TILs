import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt();

        int[] arr = new int[1000];
        int cnt = 0;

        while(true) {
            if (n < b) {
                arr[cnt++] = n;
                break;
            }

            arr[cnt++] = n % b;
            n /= b;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        
    }
}