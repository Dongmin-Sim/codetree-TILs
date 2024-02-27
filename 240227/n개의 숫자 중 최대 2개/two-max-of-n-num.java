import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MAX = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = INT_MAX;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            } else {
                arr2[i] = arr[i]; 
            }
        }
        System.out.print(maxVal + " ");
        
        maxVal = INT_MAX;
        for (int i = 0; i < n; i++) {
            if (arr2[i] > maxVal) {
                maxVal = arr2[i];
            }
        }
        System.out.print(maxVal + " ");
    }
}