import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        char[] answerChar = new char[1000];
        int[] answerCnt = new int[1000];
        int idx = 0;

        char prevChar = word.charAt(0);
        int currCnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != prevChar) {
                idx++;
                currCnt = 0;
            }
            currCnt++;
            prevChar = word.charAt(i);
            answerChar[idx] = prevChar;
            answerCnt[idx] = currCnt;
        }

        String answer = "";
        for (int i = 0; i < idx+1; i++) {
            answer += Character.toString(answerChar[i]);
            answer += Integer.toString(answerCnt[i]);
        }

        System.out.println(answer.length());
        System.out.println(answer);
    }
}