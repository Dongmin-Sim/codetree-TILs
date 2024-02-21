import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int plus = 1;
        int minus = 1;

        int plusTemp = 1;
        int minusTemp = 1;
        
        for (int i = 0; i < n; i++) {
            if (i == 0) { // 1. 첫번째일때,
                continue;
            }

            if ((array[i] * -1) > 0 && (array[i - 1] * -1) < 0) { // 3. 음수 -> 양수로 변경 시점
                minusTemp = 1;
            } else { // 2. 양수 -> 음수로 변경 시점
                plusTemp = 1;
            }

            if ((array[i] * -1) > 0 && (array[i - 1] * -1) > 0) {
                minusTemp++;
            } else {
                plusTemp++;
            }

            plus = Math.max(plusTemp, plus);
            minus = Math.max(minusTemp, minus);

        }

        System.out.println(Math.max(plus, minus));
    }
}