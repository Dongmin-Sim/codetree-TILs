import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.print(sumVal(a*b*c));
    }

    public static int sumVal(int n) {
        // if n / 10 == 0 return n; 
        if (n < 10) return n;

        return sumVal(n/10) + (n % 10);
    }
}