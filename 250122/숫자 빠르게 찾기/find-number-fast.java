import java.util.Scanner;

public class Main {
    public static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            findIndex(sc.nextInt());
        }
    }
    
    public static void findIndex(int num) {
        int l= 0, r=array.length-1;
        while(l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == num) {
                System.out.println(m+1);
                return;
            }

            if (array[m] > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        System.out.println(-1);
    }
}