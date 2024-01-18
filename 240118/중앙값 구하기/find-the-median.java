import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    
        // 중앙값이 되기 위한 조건 
        // 자신보다 작은 값이 있고, 자신보다 큰값이 있어야함.
        
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a);
        }
        else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}