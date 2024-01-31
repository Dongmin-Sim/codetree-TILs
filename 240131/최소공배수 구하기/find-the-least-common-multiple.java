import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        printLcd(n, m);
    }

    public static void printLcd(int n, int m) {
        int gcd = 0;
        for(int i = 1; i < Math.min(n, m); i++) {
            if(n%i==0 && m%i==0) {
                gcd = i;
            }
        }

        System.out.print(n*m/gcd);
    }
}