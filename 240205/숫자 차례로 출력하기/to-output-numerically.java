import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ascending(n);
        System.out.println();
        decending(n);
    }

    public static void ascending(int n) {
        if(n==0) return;

        ascending(n-1);
        System.out.print(n + " ");
    }

    public static void decending(int n) {
        if(n==0) return;

        System.out.print(n + " ");
        decending(n-1);
    }
}