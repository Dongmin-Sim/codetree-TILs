import java.util.Scanner;

public class Main {
    public static int[] monthDay = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] dayName = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();

        int cnt = changeToDays(m2, d2) - changeToDays(m1, d1);
        if (cnt < 0) {
            System.out.println(dayName[7 - (Math.abs(cnt) % 7)]);;
        } else {
            System.out.println(dayName[cnt % 7]);;
        }

    }

    public static int changeToDays(int month, int day) {
        int result = day;
        for (int i = 1; i < month; i++) {
            result += monthDay[i];
        }

        return result;
    }
}