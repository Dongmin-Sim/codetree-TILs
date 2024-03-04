import java.util.Scanner;

public class Main {
    public static int[] binrayArr = new int[1000];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        while (true) {
            if (n<2) {
                binrayArr[cnt++] = n;
                break;
            }

            binrayArr[cnt++] = n % 10;
            n /= 10;
        }

        int max = Integer.MIN_VALUE;

        for (int i = cnt-1; i >=0 ; i--) {
            if (binrayArr[i] == 1) {
                binrayArr[i] = 0;
                max = Math.max(max, changeToTen(cnt));
                binrayArr[i] = 1;
            } else {
                binrayArr[i] = 1;
                max = Math.max(max, changeToTen(cnt));
                binrayArr[i] = 0;
            }
        }

        System.out.println(max);
    }

    public static int changeToTen(int cnt) {
        int num = 0;
        for (int i = cnt-1; i >= 0 ; i--) {
            num = num * 2 + binrayArr[i];
        }
        return num;
    }
}