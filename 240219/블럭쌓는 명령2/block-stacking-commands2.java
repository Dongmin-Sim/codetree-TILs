import java.util.Scanner;

public class Main {

    public static int[] blockArr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        blockArr = new int[n+1];

        for (int i = 0; i < k; i++) {
            upBlock(sc.nextInt(), sc.nextInt());
        }

        int max = -1;
        for (int i = 0; i < blockArr.length; i++) {
            max = Math.max(max, blockArr[i]);
        }
        System.out.print(max);

    }

    public static void upBlock(int start, int end) {

        for (int i = start; i <= end; i++) {
            blockArr[i]++;
        }
    }
}