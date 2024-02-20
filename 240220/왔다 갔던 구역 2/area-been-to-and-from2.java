import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000;
    public static int MAX_R = 2000;
    public static int MAX_N = 100;

    public static int[] start = new int[MAX_N];
    public static int[] end = new int[MAX_N];
    public static int[] result = new int[MAX_R+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cur = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') {
                start[i] = cur;
                end[i] = cur + num;
                cur += num;
            } else {
                start[i] = cur - num;
                end[i] = cur;
                cur -= num;
            }

            start[i] += OFFSET;
            end[i] += OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j < end[i]; j++) {
                result[j]++;
            }
        }
        int cnt = 0;
        for (int i = 0; i <=MAX_R; i++) {
            if (result[i] >= 2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}