import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;

    public static double[] moveA;
    public static double[] moveB;

    public static int totalTime = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        moveA = new double[1000 * 1000];
        moveB = new double[1000 * 1000];

        int time = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            totalTime += t;
            for (int j = 0; j < t; j++) {
                moveA[time] =moveA[time-1] + v;
                time++;
            }
        }

        time = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++) {
                moveB[time] =moveB[time-1] + v;
                time++;
            }
        }

        int count = 0;
        int prevState = 2;
        for (int i = 1; i < totalTime; i++) {
            int curState = -1;
            if (moveA[i] > moveB[i]) {
                curState = 0;
            } else if (moveA[i] < moveB[i]) {
                curState = 1;
            } else {
                curState = 2;
            }

            if (prevState != curState) {
                count++;
            }
            prevState = curState;
        }

        System.out.println(count);
    }
}