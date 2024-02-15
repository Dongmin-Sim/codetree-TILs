import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        double avg = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = sc.nextInt();
                avg += temp;
                arr[i][j] = temp;
            }
        }

        for (int i = 0; i < 2; i++) {
            double horizontalAvg = 0;
            for (int j = 0; j < 4; j++) {
                horizontalAvg += arr[i][j];
            }
            horizontalAvg /= 4;
            System.out.printf("%.1f ", horizontalAvg);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            double verticalAvg = 0;
            for (int j = 0; j < 2; j++) {
                verticalAvg += arr[j][i];
            }
            verticalAvg /= 2;
            System.out.printf("%.1f ", verticalAvg);
        }

        System.out.println();
        System.out.printf("%.1f ", avg/8);
    }
}