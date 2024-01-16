import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int result = a;

        if (result < b) {
            result = b;
            if (result < c) {
                result = c;
            }
        } else {
            if (result < c) {
                result = c;
            }
        }
        System.out.println(result);
    }
}