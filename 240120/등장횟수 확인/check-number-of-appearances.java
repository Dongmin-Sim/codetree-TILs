import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n, cnt = 0;

        for (int i = 0; i < 5; i++) {
            n = sc.nextInt();
            if(n % 2 == 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}