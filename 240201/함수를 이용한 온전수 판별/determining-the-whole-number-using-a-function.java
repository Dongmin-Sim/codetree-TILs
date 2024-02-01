import java.util.Scanner;

public class Main {
    public static boolean isOnjensu(int n) {
        boolean result = true; 

        if (n % 2 == 0) {
            result = false;
        } else if (n % 10 == 5) {
            result = false;
        } else if (n % 3 ==0 && n % 9 != 0) {
            result = false;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if(isOnjensu(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}