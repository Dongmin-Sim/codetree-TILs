import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MIN_VALUE;
        final int INT_MIN = Integer.MAX_VALUE;

        int minVal = INT_MIN, maxVal = INT_MAX;

        while (true) {
            int num = sc.nextInt();
            if (num == 999 | num == -999) {
                break;
            }

            if (minVal > num) {
                minVal = num;
            }

            if (maxVal < num) {
                maxVal = num;
            }
        }

        System.out.println(maxVal + " " + minVal);
    }
}