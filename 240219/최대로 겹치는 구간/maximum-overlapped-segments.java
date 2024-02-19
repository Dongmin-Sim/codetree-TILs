import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[200];

        for (int i = 0; i < n; i++) {
            upBlock(sc.nextInt()+100, sc.nextInt() - 1+100);
        }

        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }

    public static void upBlock(int start, int end) {
        for (int i = start; i <= end; i++) {
            arr[i]++;
        }
    }
}