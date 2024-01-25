import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt(), b = sc.nextInt();
            char c = sc.next().charAt(0);

            System.out.println(a*b);

            if(c == 'C') {
                break;    
            }
        }
    }
}