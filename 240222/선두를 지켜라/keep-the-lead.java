import java.util.Scanner;

public class Main {
    public static int MAX = 1000 * 1000;
    public static int[] timeTableA = new int[MAX + 1];
    public static int[] timeTableB = new int[MAX + 1];

    public static int n;
    public static int m;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        n = sc.nextInt();
        m = sc.nextInt();

        int spendTime = makeTimeTable(n, 'A');
        makeTimeTable(m, 'B');

        int cnt = 0;
        char prevWinner = 'N';
        for (int i = 1; i <= spendTime; i++) {
            char curWinner;
            if (timeTableA[i] > timeTableB[i]) {
                curWinner = 'A';
            } else if (timeTableA[i] < timeTableB[i]) {
                curWinner = 'B';
            } else {
                curWinner = prevWinner;
            }
            // cnt++
            if (prevWinner != 'N' && prevWinner != curWinner) {
                cnt++;
            }

            prevWinner = curWinner;
        }
        System.out.println(cnt);
    }

    public static int makeTimeTable(int num, char type) {
        int[] timeTable = type == 'A' ? timeTableA : timeTableB;
        int curLocation = 0;
        int curTime = 1;

        for (int i = 0; i < num; i++) {
            int speed = sc.nextInt();
            int time = sc.nextInt();

            for (int j = 0; j < time; j++) {
                curLocation += speed;
                timeTable[curTime++] = curLocation;
            }
        }
        return curTime;
    }
}