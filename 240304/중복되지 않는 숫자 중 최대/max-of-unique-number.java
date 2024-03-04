import java.util.Scanner;

public class Main {
    public static int MAX = 1000;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] cnt = new int[MAX+1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
        }

        int max = -1;
        for (int maxCandidate = MAX; maxCandidate >= 0; maxCandidate--) {
            if (cnt[maxCandidate] == 1) {
                max = maxCandidate;
                break;
            }
        }
        System.out.println(max);
    }
}