import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        String targetStr = sc.next();

        int cnt = 0;
        for (int i = 0; i < inputStr.length()-1; i++) {

            boolean isMatch = true;
            for (int j = 0; j < targetStr.length(); j++) {
                if (inputStr.charAt(i + j) != targetStr.charAt(j)) {
                    isMatch = false;
                }
            }

            if (isMatch) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}