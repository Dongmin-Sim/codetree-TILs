import java.util.Scanner;

public class Main {
    public static int[] student;
    public static int[] penaltyCount;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        student = new int[n+1];
        penaltyCount = new int[n+1];

        for (int i = 0; i < m; i++) {
            int personNum = sc.nextInt();
            penaltyCount[personNum]++;
            for (int j = 1; j < n+1; j++) {
                if (penaltyCount[j] >= k) {
                    System.out.println(j);
                    return;
                }
            }
        }
        System.out.println(-1);

    }
}