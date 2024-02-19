import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int num = 0;
        // 10진수 
        for(int i = 0; i < binary.length(); i++) {
            num = num * 2 + (binary.charAt(i) - '0');
        }

        num *= 17;

        int[] arr = new int[100];
        int cnt = 0;

        while(true) {
            if(num < 2) {
                arr[cnt++] = num;
                break;
            }

            arr[cnt++] = num % 2;
            num /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

    }
}