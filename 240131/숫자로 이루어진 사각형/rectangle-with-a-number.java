import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n) {
        int cnt = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(cnt > 9) {
                    cnt = 1;
                }
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}