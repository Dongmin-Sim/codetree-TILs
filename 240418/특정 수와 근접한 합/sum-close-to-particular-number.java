import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int tempSum = 0;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        tempSum += array[k];
                    }
                }
                min = Math.min(min, Math.abs(tempSum-s));
            }
        }
        System.out.println(min);
    }
}