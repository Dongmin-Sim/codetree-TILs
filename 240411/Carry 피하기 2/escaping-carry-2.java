import java.util.Scanner;

public class Main {
    public static boolean isCarry(int i, int j, int k) {
        int divider = 10000;
        while (divider > 0) {
            int i1 = i / divider;
            int i2 = j / divider;
            int i3 = k / divider;

            if (i1 + i2 + i3 >= 10) {
                return true;
            } else {
                i = i % divider;
                j = j % divider;
                k = k % divider;
            }
            divider /= 10;
        }
        return false;
    }

    public static int answer = -1;

    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (!isCarry(arr[i], arr[j], arr[k])) {
                        answer = Math.max(answer, (arr[i] + arr[j] + arr[k]));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}