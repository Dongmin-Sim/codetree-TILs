import java.util.Scanner;

public class Main {
    public static int MAXT = 1000;
    public static int[] timeTableA = new int[MAXT];
    public static int[] timeTableB = new int[MAXT];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();


        // TODO simulation Time table
        makeTimeTable(n, 'A');
        makeTimeTable(m, 'B');

        for (int i = 0; i < MAXT; i++) {
            if (timeTableA[i] == timeTableB[i]) {
                System.out.println(i+1);
                break;
            }
        }
    }

    public static void makeTimeTable(int n, char type) {
        int curPosition = 0, curTime = 0;
        int[] table = type == 'A' ? timeTableA : timeTableB;

        for (int i = 0; i < n; i++) {
            char direct = sc.next().charAt(0);
            int move = sc.nextInt();

            for (int j = 0; j < move; j++) {
                if (direct == 'R') {
                    curPosition++;
                } else {
                    curPosition--;
                }
                table[curTime++] = curPosition;
            }
        }

    }
}