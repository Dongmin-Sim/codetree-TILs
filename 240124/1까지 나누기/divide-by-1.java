import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(true) {
            n/=i;
            if(n <= 1)
                break;

            i++;
        }
        System.out.print(i);
    }
}