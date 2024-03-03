import java.util.Scanner;

public class Main {
    public static char[][] matrix;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();

        matrix = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        // 이동은 항상 점프를 통해서만 가능, 점프 진행시 현재 적혀잇는 색과 달라야함.
        int cnt = 0;

        // 첫번째 이동 후보
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                // 두번째 이동 후보
                for (int k = i+1; k < r-1; k++) {
                    for (int l = j+1; l < c-1; l++) {
                        // 첫번째와 두번째 색상이 다르고, 두번째와 세번째 색상이 다르고, 세번째랑 네번째랑 다른거
                        if (matrix[0][0] != matrix[i][j] && matrix[i][j] != matrix[k][l] && matrix[k][l] != matrix[r-1][c-1]) {
                            cnt++;
                        }
                    }

                }

            }
        }

        System.out.println(cnt);
    }
}