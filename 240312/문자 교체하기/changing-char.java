import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        String targetStr = sc.next();

        char[] inputCharArray = inputStr.toCharArray();
        char[] targetCharArray = targetStr.toCharArray();

        targetCharArray[0] = inputCharArray[0];
        targetCharArray[1] = inputCharArray[1];

        System.out.println(String.valueOf(targetCharArray));
    }
}