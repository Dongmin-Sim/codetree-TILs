import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.print(findLeast(a, b, c));
    }

    public static int findLeast(int a, int b, int c) {
        int minVal = a;

        if (minVal > b)
            minVal = b;
        if (minVal > c)
            minVal = c;

        return minVal;
    }
}