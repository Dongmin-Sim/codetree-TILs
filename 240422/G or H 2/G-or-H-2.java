import java.util.Scanner;

public class Main {
    public static int N;

    public static char[] alphas = new char[100+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            int idx = sc.nextInt();
            char alpha = sc.next().charAt(0);
            alphas[idx] = alpha;
            maxLength = Math.max(maxLength, idx);
        }

        int maxPhotoSize = 0;
        // 시작 지점
        for (int i = 0; i < 100 + 1 - maxLength; i++) {
            if (alphas[i] != 'G' && alphas[i] != 'H') {
                continue;
            }
            // 끝 지점
            for (int j = i; j < maxLength; j++) {
//                if (alphas[j] != 'G' && alphas[j] != 'H') {
//                    continue;
//                }
                // 시작 i ~ 끝 j 까지 G나 H로 이루어져 있거나,
                // G == H의 수가 정확히 같은 개수일 경우 maxPhotoSize 갱신
                int gCnt = 0, hCnt = 0;
                for (int k = i; k <= j; k++) {
                    if (alphas[k] == 'G') {
                        gCnt++;
                    } else if (alphas[k] == 'H') {
                        hCnt++;
                    } else {
                        continue;
                    }
                    // maxPhotoSize 갱신
                    if ((gCnt > 0 && hCnt == 0) || (gCnt == 0 && hCnt > 0) || (gCnt == hCnt)) {
                        maxPhotoSize = Math.max(maxPhotoSize, k - i);
                    }
                }
            }
        }
        System.out.println(maxPhotoSize);
    }
}