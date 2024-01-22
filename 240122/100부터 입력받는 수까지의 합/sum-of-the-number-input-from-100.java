import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumVal = 0;
        for(int i = n; i <= 100; i++){
            sumVal += i;
        }

        System.out.print(sumVal);
    }
}