import java.util.Scanner;

public class Main {
    public static int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();

        int result = (getDays(m2) + d2) - (getDays(m1) + d1) + 1;

        System.out.println(result);
    }
    public static int getDays(int month) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += monthDays[i-1];
        }
        return days;
    }
}

// 31 + 28 = 59 
// 31 + 28 + 31 + 14 = 104

// 334 + 5 = 339
// 365 + 21 = 386