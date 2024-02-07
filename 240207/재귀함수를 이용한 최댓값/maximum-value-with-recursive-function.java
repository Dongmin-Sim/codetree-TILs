import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(recursiveMax(n-1));
    }
    public static int recursiveMax(int idx) {
        // if n == 0 return arr[n];
        if (idx == 0) return arr[idx];


        int temp = recursiveMax(idx-1);
        if(arr[idx] > temp) {
            return arr[idx];
        } else {
            return temp;
        }
    }
}