import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // 11 11:11 ~ a b:c

        // System.out.println(changeToMinute(11, 11, 11));

        // int temp = changeToMinute(a, b, c);
        // if (temp > 0) {
        //     System.out.println(temp);
        // } else {
        //     System.out.println(-1);
        // } 
        System.out.println(((a - 11 + 1) * 12 * 60) + ((b-11)*60) + c-11);
    }

    public static int changeToMinute(int day, int hour, int min) {
        int result = 0;

        result += (hour * 60) + min;
        result += (day * 12 * 60);
        return result;
    }
}