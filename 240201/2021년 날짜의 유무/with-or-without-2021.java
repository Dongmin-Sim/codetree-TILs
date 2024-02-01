import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean validateYearMonth(int m, int d) {
        if(m > 12) {
            return false;
        }
        int[] arr31 = {1, 3, 5, 7, 8, 10, 12};
        int[] arr30 = {4, 6, 9, 11};

        // 31 : 1, 3, 5, 7, 8, 10, 12;
        // 30 : 4, 6, 9, 11;
        // 28 : 2;
        if (Arrays.stream(arr31).anyMatch(it -> it == m)) {
            return d <= 31;
        } else if (Arrays.stream(arr30).anyMatch(it -> it == m)) {
            return d <= 30;
        } else {
            return d <= 28;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();

        if(validateYearMonth(m, d)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}