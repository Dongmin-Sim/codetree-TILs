import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String subString = sc.next();

        int resultIdx = -1;
        int wordIdx = 0;
        int subStringIdx = 0;

        // apple
        // pp
        while (true) {
            if (wordIdx == word.length() || subStringIdx == subString.length()) {
                break;
            }

            if (word.charAt(wordIdx) == subString.charAt(subStringIdx)) {
                if (subStringIdx == 0) {
                    resultIdx = wordIdx;
                }
                subStringIdx++;
            } else {
                subStringIdx = 0;
                if (word.charAt(wordIdx) == subString.charAt(0)) {
                    continue;
                }
                resultIdx = -1;
            }

            wordIdx++;
        }

        if (subStringIdx == subString.length()) {
            System.out.println(resultIdx);
        } else {
            System.out.println(-1);
        } 
    }
}