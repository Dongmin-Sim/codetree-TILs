import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String answer = "";

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            answer += sc.next();
        }

        for (int i = 0; i < answer.length(); i++) {
            if (i !=0 && i % 5 == 0) {
                System.out.println();
            }
            System.out.print(answer.charAt(i));
        }
    }
}