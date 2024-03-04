import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if ((temp >= 'a' && temp <= 'z') || (temp >= '0' && temp <= '9')) {
                System.out.print(temp);
            } else if (temp >= 'A' && temp <= 'Z') {
                System.out.print((char)(temp - 'A' + 'a'));
            }
        }
    }
}