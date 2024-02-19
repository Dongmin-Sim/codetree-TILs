import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[100];
        
        int idx =0;
        while(n > 0) {
            binary[idx++] = n % 10;
            n /= 10;
        }
        
        int num = 0;
        for(int i = idx; i >=0; i--) {
            num = num * 2 + binary[i];
        }

        System.out.println(num);
    }
}