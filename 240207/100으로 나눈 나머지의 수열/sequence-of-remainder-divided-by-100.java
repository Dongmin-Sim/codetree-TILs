import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(recursive(n));
    }
    public static int recursive(int n) {
        // r(n) = (r(n-1) * r(n-2)) % 100; 
        if (n == 1) return 2;
        if (n == 2) return 4;

        return (recursive(n-1) * recursive(n-2)) % 100;
    }
}