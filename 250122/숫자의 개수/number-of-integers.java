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
            int num = sc.nextInt();
            System.out.println(upperBound(num) - lowerBound(num));
        }
    }

    public static int lowerBound(int num) {
        int l = 0, r = array.length;
        while(l < r) {
            int m = l + (r - l) / 2;

            if (array[m] >= num) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    public static int upperBound(int num) {
        int l = 0, r = array.length;
        while(l < r) {
            int m = l + (r - l) / 2;

            if (array[m] > num) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }
}