import java.util.Scanner;

public class Main {
    public static int[] x1Arr;
    public static int[] x2Arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        x1Arr = new int[n];
        x2Arr = new int[n];

        for (int i = 0; i < n; i++) {
            x1Arr[i] = sc.nextInt();
            x2Arr[i] = sc.nextInt();
        }

        // 두 선분이 교차하는 조건
        // (x1, 0), (x2, 1) ... (x3, 0), (x4, 1)
        // x1 < x3 && x2 > x4
        // x1 > x3 && x2 < x4

        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                int x1 = x1Arr[i], x2 = x2Arr[i];
                int x3 = x1Arr[j], x4 = x2Arr[j];

                if ((x1 < x3 && x2 > x4) || (x1 > x3 && x2 < x4)) {
                    // 겹침
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}