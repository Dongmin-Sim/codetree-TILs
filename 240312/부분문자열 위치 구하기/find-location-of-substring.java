import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        String targetStr = sc.next();

        int inputLen = inputStr.length();
        int targetLen = targetStr.length();

        for (int i = 0; i < inputLen; i++) {

            if (i + targetLen - 1 >= inputLen) {
                continue;
            }

            boolean isMatched = true;
            for (int j = 0; j < targetLen; j++) {
                if (inputStr.charAt(i + j) != targetStr.charAt(j)) {
                    isMatched = false;
                    break;
                }
            }
            if (isMatched) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}