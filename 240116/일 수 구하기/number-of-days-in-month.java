import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 31, 28, 31 30 31 30 31 // 31 30 31 30 31
        // 1, 3, 5, 7, 8, 10 12
        // 2 
        // 4, 6, 9, 11
        if (n < 8) {
            if (n % 2 == 0) {
                if (n == 2) {
                    System.out.println(28);
                }
                System.out.println(30);
            } else {
                System.out.println(31);
            }

        } else {
            if (n % 2 == 0) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        }
    }
}