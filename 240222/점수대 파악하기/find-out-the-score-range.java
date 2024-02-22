import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[11];
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            countArr[num / 10]++;
        }

        for (int i = 11; i > 0; i--) {
            System.out.println(i * 10 + " - " + countArr[i]);
        }
    }
}