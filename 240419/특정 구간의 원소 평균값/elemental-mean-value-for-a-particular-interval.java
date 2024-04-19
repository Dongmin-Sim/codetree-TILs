import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        // 시작 지점
        for (int i = 0; i < n; i++) {
            // 끝 지점
            for (int j = i; j < n; j++) {
                // 평균 구하기
                int sum = 0, temp = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    temp++;
                }
                double avg = (double) sum / temp;

                // 평균이 해당 범위에 있는지 확인
                for (int k = i; k <= j; k++) {
                    // 있다면 cnt++
                    if (avg == arr[k]) {
                        cnt++;
                        break;
                    }

                }
            }
        }
        System.out.println(cnt);


    }
}