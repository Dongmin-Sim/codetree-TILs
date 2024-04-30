import java.util.Scanner;

public class Main {
    public static int[][] race;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        race = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                race[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        // a 번째 개발자
        for (int a = 1; a <= n; a++) {
            // b 번째 개발자
            for (int b = 1; b <= n; b++) {
                // a == b 같은 쌍일 경우 pass
                if (a==b) continue;
                // 모든 경기에 대해 항상 높은 순위인지 확인,
                boolean alwaysWin = true;
                for (int l = 0; l < k; l++) {
                    int[] players = race[l];
                    int aRank = -1;
                    int bRank = -1;

                    for (int i = 0; i < players.length; i++) {
                        if (a == players[i]) {
                            aRank = i;
                        }
                        if (b == players[i]) {
                            bRank = i;
                        }
                    }
                    if (aRank > bRank) {
                        alwaysWin = false;
                        break;
                    }
                }

                // true 라면 pair++
                // false 라면 다음 쌍 검사
                if (alwaysWin) count++;
            }
        }
        System.out.println(count);
    }
}