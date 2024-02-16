import java.util.Scanner;

public class Main {
    public static String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        String day = sc.next();

        int diff = getDays(m2, d2) - getDays(m1, d1);

        int idx = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                idx = i;
            }
        }

        int result = diff / 7;

        if ((diff % 7) >= idx) {
            result++;
        }
        System.out.println(result);
    }

    public static int getDays(int month, int day) {
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = day;

        for (int i = 1; i < month; i++) {
            result += days[i];
        }
        return result;
    }
}