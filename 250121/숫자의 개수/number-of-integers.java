import java.util.Scanner;

public class Main {
    public static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++) {
            int target = sc.nextInt();
            int countOfElement = upperBound(target) -  lowerBound(target);
            System.out.println(countOfElement);
        }
    }

    public static int lowerBound(int target){
        int l = 0, r = array.length - 1;
        int minIdx = array.length;

        while(l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] >= target) {
                r = m - 1;
                minIdx = Math.min(minIdx, m);
            } else {
                l = m + 1;
            }
        }

        return minIdx;
    };

    public static int upperBound(int target){
        int l = 0, r = array.length - 1;
        int minIdx = array.length;

        while(l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] > target) {
                r = m - 1;
                minIdx = Math.min(minIdx, m);
            } else {
                l = m + 1;
            }
        }

        return minIdx;
    };

}