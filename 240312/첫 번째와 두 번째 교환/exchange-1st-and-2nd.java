import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        char[] answerArray = new char[inputStr.length()];

        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == inputStr.charAt(0)) {
                answerArray[i] = inputStr.charAt(1);
            } else if (inputStr.charAt(i) == inputStr.charAt(1)) {
                answerArray[i] = inputStr.charAt(0);
            } else {
                answerArray[i] = inputStr.charAt(i);
            } 

        }

        System.out.println(String.valueOf(answerArray));
    }
}