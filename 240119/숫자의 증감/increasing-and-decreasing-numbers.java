import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int c = sc.next().charAt(0);
        int n = sc.nextInt();

        if( c == 'A') {
            // 오름차순
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        if (c == 'D') {
            // 내림차순
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }
}