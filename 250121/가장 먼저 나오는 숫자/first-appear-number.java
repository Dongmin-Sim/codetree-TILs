import java.util.Scanner;

public class Main {
    public static int[] array = new int[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();
            findFirstIndex(num);
        }
    }

    public static void findFirstIndex(int num) {
        int l = 0, r = array.length;

        while(l < r) {
            int m = l + (r - l) / 2;
            if (array[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        if (array[l] == num) return l;
        return -1;
    }
}