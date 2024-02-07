import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int getGCD(int a, int b) {
        int temp;
        while(b!=0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(lcm(n-1));
    }

    public static int lcm(int idx) {
        if (idx==0) return arr[idx];

        // temp와 lcm(idx-1)의 최소 공배수를 구해서 던져주면됨. 
        int a = arr[idx];
        int b = lcm(idx - 1);
        return getLCM(a, b);
    }
}