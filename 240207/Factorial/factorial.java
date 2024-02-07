import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.print(result);
    }

    public static int factorial(int n) {
        // f(n) = f(n-1) * n;
        if(n==1) return 1;

        return factorial(n-1) * n;
    }
}