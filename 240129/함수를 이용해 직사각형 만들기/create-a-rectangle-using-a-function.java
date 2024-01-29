import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        printOneMatrix(n, m);

    }

    public static void printOneMatrix(int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}