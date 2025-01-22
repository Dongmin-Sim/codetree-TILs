import java.util.Scanner;

public class Main {
    private static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++) {
            lowerUpper(sc.nextInt());
        }
    }

    public static void lowerUpper(int num){
        int l = 0, r = array.length;

        while(l<r) {
            int m = l + (r - l) / 2;
            if (array[m] >= num) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        if (l < array.length && array[l] == num) {
            System.out.println(l+1);
            return;
        }
        System.out.println(-1);
    }
}