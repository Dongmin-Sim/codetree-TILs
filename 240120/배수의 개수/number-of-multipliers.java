import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, cnt3, cnt5;

        for(int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if(n % 3 == 0) {
                cnt3++;
            } else if (n % 5 == 0) {
                cnt5++;
            }
        }

        System.out.print(cnt3 + " " + cnt5);
    }
}