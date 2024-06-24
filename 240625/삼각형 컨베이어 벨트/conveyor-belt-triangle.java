import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int MAX_N = 200;
    public static int[] left = new int[MAX_N + 1];
    public static int[] right = new int[MAX_N + 1];
    public static int[] down = new int[MAX_N + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // left -> right -> down -> left
        int n = sc.nextInt(), t = sc.nextInt();

        IntStream.range(0, n).forEach(i -> left[i] = sc.nextInt());
        IntStream.range(0, n).forEach(i -> right[i] = sc.nextInt());
        IntStream.range(0, n).forEach(i -> down[i] = sc.nextInt());


        for (int i = 0; i < t; i++) {
            int temp = down[n - 1];

            for (int j = 1; j < n; j++) {
                down[n-j] = down[n-j-1];
            }
            down[0] = right[n - 1];
            for (int j = 1; j < n; j++) {
                right[n-j] = right[n-j-1];
            }
            right[0] = left[n - 1];
            for (int j = 1; j < n; j++) {
                left[n-j] = left[n-j-1];
            }
            left[0] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(down[i] + " ");
        }
    }
}