import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        char[] charArray = inputStr.toCharArray();

        charArray[1] = 'a';
        charArray[inputStr.length() - 2] = 'a';

        System.out.println(String.valueOf(charArray));;
    }
}