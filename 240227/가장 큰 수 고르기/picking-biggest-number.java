import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MIN = Integer.MIN_VALUE;
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = INT_MIN;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }
}