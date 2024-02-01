import java.util.Scanner;
public class Main {
    public static boolean isYunYear(int year) {
        //4의 배수라면 윤년입니다.
            //4의 배수이면서 100의 배수라면 윤년이 아닙니다.
            //4의 배수이면서 100의 배수가 아니면 윤년입니다.
            //4의 배수이면서 100의 배수지만 또한 400의 배수라면 윤년입니다.
        //나머지 경우에는 윤년이 아닙니다.
        if (year % 4 == 0) {
            if (year % 100 != 0) return true;
            return year % 100 == 0 && year % 400 == 0;
        }
        return false;
    };

    public static boolean validateDate(int y, int m, int d) {
        // 31 : 1, 3, 5, 7, 8, 10, 12;
        // 30 : 4, 6, 9, 11;
        // 28 : 2;
        if (m == 1 | m == 3 | m == 5 | m == 7 | m == 8 | m == 10 | m == 12) {
            return d <= 31;
        } else if (m == 4 | m == 6 | m == 9 | m == 11) {
            return d <= 30;
        } else {
            if (isYunYear(y)) {
                return d <= 29;
            } else return d <= 28;
        }
    }
    public static void printSeason(int y, int m, int d) {
        if (validateDate(y, m, d)) {
            if (m < 3){
                System.out.println("Winter");
            } else if (m < 6) {
                System.out.println("Spring");
            } else if (m < 9) {
                System.out.println("Summer");
            } else if (m < 12) {
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();

        printSeason(y, m, d);
    }
}