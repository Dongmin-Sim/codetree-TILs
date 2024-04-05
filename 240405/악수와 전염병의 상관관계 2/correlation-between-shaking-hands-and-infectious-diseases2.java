import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int k;
    public static int p;
    public static int t;
    public static int[] isInfect;
    public static LinkedList<Integer>[] handShake = new LinkedList[250+1];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        p = sc.nextInt();
        t = sc.nextInt();

        isInfect = new int[n + 1];
        isInfect[p] = k+1;

        for (int i = 0; i < t; i++) {
            int sec = sc.nextInt();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            handShake[sec] = new LinkedList<>();
            handShake[sec].add(p1);
            handShake[sec].add(p2);
        }

        // k+1 감염 / 0 비감염 / 1 보균
        for (int i = 0; i < 250 + 1; i++) {
            if (handShake[i] == null) {
                continue;
            }

            int p1 = handShake[i].get(0);
            int p2 = handShake[i].get(1);

            // p1 이 감염  -> p2가 비감염일때
            if (isInfect[p1] > 0 && isInfect[p2] == 0) {
                if (isInfect[p1] != 1) {
                    isInfect[p1]--;
                    isInfect[p2] = k + 1;
                }
            }
            // p2 이 감염  -> p1가 비감염일때
            else if (isInfect[p2] > 0 && isInfect[p1] == 0) {
                if (isInfect[p2] != 1) {
                    isInfect[p2]--;
                    isInfect[p1] = k + 1;
                }
            }

            // 둘 다 감염 -> 횟수깍기
            else if (isInfect[p2] > 0 && isInfect[p1] > 0) {
                if (isInfect[p2] != 1) {
                    isInfect[p2]--;
                }
                if (isInfect[p1] != 1) {
                    isInfect[p1]--;
                }
            }
        }
        for (int i = 1; i < isInfect.length; i++) {
            if (isInfect[i] == 0) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
            
        }

    }
}