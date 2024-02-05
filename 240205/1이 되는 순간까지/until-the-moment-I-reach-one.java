import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(recursiveDivide(n));
    }

    public static int recursiveDivide(int n) {
        if (n==1) return 0;

        if(n % 2 == 0) {
            return recursiveDivide(n/2) + 1;
        } else {
            return recursiveDivide(n/3) + 1;
        }
    }
}