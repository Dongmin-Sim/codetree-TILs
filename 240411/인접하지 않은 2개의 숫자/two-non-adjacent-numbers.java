import java.util.Scanner;

public class Main {
    public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j == i) || (j == i - 1) || (j == i + 1)) {
                    continue;
                }
                max = Math.max(max, (arr[i]+ arr[j]));
            }
        }
        System.out.println(max);
    }
}