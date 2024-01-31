import java.util.Scanner;

public class Main {

    public static boolean contain369(int i) {
        int q = i;
        while (true) {
            int temp = q % 10;
            if(temp == 3 | temp == 6 | temp == 9) {
                return true;
            }

            q = q / 10;
            
            if(q == 0) {
                return false;
            }
        }
    }
    public static boolean isMagicNumber(int i) {
        return (i % 3 == 0) | contain369(i);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if(isMagicNumber(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}