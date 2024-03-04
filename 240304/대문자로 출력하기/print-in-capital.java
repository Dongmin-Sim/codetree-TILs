import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                System.out.print(string.charAt(i));
            } else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                int temp = string.charAt(i) - 'a';
                System.out.print((char)(temp + 'A'));
            }
        }
    }
}