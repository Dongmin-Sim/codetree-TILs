import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;
    public static int D;
    public static int S;

    public static int[][] dArray;
    public static Map<Integer, Integer> sMap;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        D = sc.nextInt();
        S = sc.nextInt();

        dArray = new int[D][3];
        sMap = new HashMap<>();

        for (int i = 0; i < D; i++) {
            int p = sc.nextInt(), m =sc.nextInt(), t = sc.nextInt();
            dArray[i] = new int[]{p,m,t};
        }

        for (int i = 0; i < S; i++) {
            int p = sc.nextInt(), t = sc.nextInt();
            sMap.put(p, t);
        }

        int maxMedicine = 0;

        // 치즈 M 개 중에 1개씩, 상했다고 가정했을때, 완전 탐색
        for (int badCheese = 1; badCheese <= M; badCheese++) {
            int needMedicine = 0;

            boolean isNotBadCheese = false;
            // 한명씩 돌아가면서 검사
            for (int person = 1; person <= N; person++) {
                for (int i = 0; i < D; i++) {
                    int[] history = dArray[i];
                    int p = history[0], cheeseNum = history[1], eatTime = history[2];
                    // 해당 사람이면서, 상한 치즈를 먹었고,
                    if (p == person && cheeseNum == badCheese) {
                        // 실제로 아프면서
                        if (sMap.containsKey(person)) {
                            int sickTime = sMap.get(person);
                            // 아프기 전에 먹은 사람의 경우 약이 필요.
                            if (eatTime < sickTime) {
                                needMedicine++;
                                break;
                            } else {
                                isNotBadCheese = true;
                            }
                        } else {
                            // 먹었는데, 아픈 사람에는 목록이 없음.
                            needMedicine++;
                        }
                    }
                }
            }

            if (isNotBadCheese) {
                needMedicine = 0;
            }
            maxMedicine = Math.max(maxMedicine, needMedicine);
        }
        System.out.println(maxMedicine);
    }
}