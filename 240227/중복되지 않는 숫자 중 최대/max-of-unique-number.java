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
        
        int max = Integer.MIN_VALUE;
        boolean isDuplicate = false;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                isDuplicate = false;
            } else if (max == arr[i]) {
                isDuplicate = true;
            }
        }

        if (!isDuplicate) {
            System.out.println(max);
        } else {
            System.out.println(-1);
        } 
    }
}