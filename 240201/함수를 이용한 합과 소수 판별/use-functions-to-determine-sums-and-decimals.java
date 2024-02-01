import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        int sum = 0;
        while(true) {
            if(n==0) break;
            sum += n%10;
            n /=10;
        }
        return sum % 2 == 0; 
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++) {
            if(isPrime(i) && isEven(i)) {
                cnt++;        
            }
        }

        System.out.print(cnt);
    }
}