import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int length = word.length();

        int eeCnt = 0, ebCnt = 0;

        for (int i = 0; i < length - 1; i++) {
            if (word.charAt(i) == 'e' && word.charAt(i + 1) == 'e') {
                eeCnt++;
            }
            if (word.charAt(i) == 'e' && word.charAt(i + 1) == 'b') {
                ebCnt++;
            }
        }
        System.out.println(eeCnt + " " + ebCnt);
    }
}