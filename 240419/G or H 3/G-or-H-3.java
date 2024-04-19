import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static char[] alpha;
    public static int[] place = new int[10000+1];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        arr = new int[n];
        alpha = new char[n];

        for (int i = 0; i < n; i++) {
            int loc = sc.nextInt();
            char a = sc.next().charAt(0);
            arr[i] = loc;
            alpha[i] = a;
        }

        for (int i = 0; i < n; i++) {
            if (alpha[i] == 'G') {
                place[arr[i]] = 1;
            } else {
                place[arr[i]] = 2;
            }
        }

        int max = 0;
        for (int i = 0; i < 10000-k; i++) {
            int temp = 0;
            for (int j = i; j < i+k+1; j++) {
                temp += place[j];
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }
}