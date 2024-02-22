import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] count = new int[10];

        while (a > 1) {
            count[a % b]++;
            a = a / b;
        }
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += (count[i] * count[i]);
        }
        System.out.println(result);
    }
}

// 500 0 
// 250 0 
// 125 0 
// 62 1 
// 31 0 
// 15 1
// 7 1
// 3 1
// 1 1 
// 0 1