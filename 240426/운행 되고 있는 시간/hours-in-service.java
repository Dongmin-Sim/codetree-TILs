import java.util.Scanner;

public class Main {
    public static int MAX = 1000;
    public static int[] start;
    public static int[] end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        start = new int[n];
        end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int maxRunningTime = 0;
        for (int i = 0; i < n; i++) {
            int[] counting = new int[MAX];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                for (int k = start[j]; k < end[j]; k++) {
                    counting[k]++;
                }
            }
            int runningTime = 0;
            for (int j = 0; j < MAX; j++) {
                if (counting[j] != 0) runningTime++;
            }
            maxRunningTime = Math.max(maxRunningTime, runningTime);
        }
        System.out.println(maxRunningTime);
    }
}