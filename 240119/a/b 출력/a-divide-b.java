import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        
        String result = Integer.toString(a/b) + ".";

        
        int r = a%b;
        for (int i = 0; i <20; i++) {
            int q = (r*10)/b; // 더하고 몫
            result += Integer.toString(q);
            r = (r*10)%b;
        }

        System.out.print(result);
    }
}