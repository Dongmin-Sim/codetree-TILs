import java.util.Scanner;

public class Main {
    public static int[] arr;

    public static int sumVal(int i, int j) {
        int sum = 0;
        for (int k = i-1; k <= j-1; k++) {
            sum += arr[k];
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt(), a2 = sc.nextInt();
            System.out.println(sumVal(a1, a2));
        }
        
        
    }
    
}