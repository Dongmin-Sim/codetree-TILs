import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = 10;
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[n-i-1]);
        }
    }
}