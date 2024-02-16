import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // 11 11:11 ~ a b:c

        int temp = changeToMinute(a, b, c) - changeToMinute(11, 11, 11);
        if (temp > 0) {
            System.out.println(temp);
        } else {
            System.out.println(-1);
        }

    }

    public static int changeToMinute(int day, int hour, int min) {
        int result = 0;

        result += min;
        result += hour * 60;
        result += day * 24 * 60;
        return result;
    }
}