import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 100;
    public static int n;
    public static int k;
    public static int[] arr = new int[MAX_NUM + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'G') {
                arr[x] = 1;
            } else {
                arr[x] = 2;
            }
        }

        int maxPhotoSize = 0;
        for (int i = 0; i <= MAX_NUM; i++) {
            for (int j = i + 1; j <= MAX_NUM; j++) {
                if (arr[i] == 0 || arr[j] == 0) {
                    continue;
                }

                int cntG = 0, cntH = 0;

                for (int l = i; l <= j; l++) {
                    if (arr[l] == 1) {
                        cntG++;
                    } else if (arr[l] == 2) {
                        cntH++;
                    }
                }

                if (cntG == 0 || cntH == 0 || cntG == cntH) {
                    int len = j - i;
                    maxPhotoSize = Math.max(maxPhotoSize, len);
                }
            }
        }
        System.out.println(maxPhotoSize);
    }
}