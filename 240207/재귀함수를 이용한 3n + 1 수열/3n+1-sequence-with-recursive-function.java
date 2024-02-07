import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(recursiveOne(n));
    }
    public static int recursiveOne(int n) {
        // if n == 1 return 0;

        if (n==1) return 0;

        if(n%2==0) {
            return recursiveOne(n/2) + 1;
        } else {
            return recursiveOne(3*n+1) + 1;
        }

    }
}