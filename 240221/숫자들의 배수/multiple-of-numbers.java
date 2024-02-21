import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = 0;
        int temp = n;
        while (idx < 2) {
            System.out.print(temp + " ");
            if (temp % 5 == 0) {
                idx++;
            }
            temp += n;
        }
    }
}