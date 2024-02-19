import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int MIN = 100;
    public static int OFFSET = 100;
    public static int[] arr = new int[MIN + OFFSET + 2];
    public static int cur = OFFSET;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int step = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                goRight(step);
            } else {
                goLeft(step);
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                max++;
            }
        }
        System.out.println(max);
    }

    public static void goRight(int step) {
        for (int i = cur; i < cur+step; i++) {
            arr[i]++;
        }
        cur += step;
    }

    public static void goLeft(int step) {
        for (int i = cur; i > cur-step; i--) {
            arr[i]++;
        }
        cur -= step;
    }


}