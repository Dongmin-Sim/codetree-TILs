import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        char[] charArray = inputStr.toCharArray();
        char targetChar = inputStr.charAt(1);

        for (int i = 0; i < inputStr.length(); i++) {
            if (charArray[i] == targetChar) {
                charArray[i] = inputStr.charAt(0);
            }
        }
        System.out.println(String.valueOf(charArray));
    }
}