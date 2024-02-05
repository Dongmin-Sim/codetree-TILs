import java.util.Scanner;

public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sumVal(m));
    }

    public static int sumVal(int m) {
        int sum = 0;

        while (true) {
            sum += arr[m-1];
            if (m == 1) break;

            if (m % 2 == 1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }
        return sum;
    }


}