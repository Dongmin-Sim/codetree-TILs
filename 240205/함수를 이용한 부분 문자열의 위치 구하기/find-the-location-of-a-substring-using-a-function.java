import java.util.Scanner;
public class Main {

    public static int leastIndex = -1;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next(), sub = sc.next();
        
        subString(word, sub);
        System.out.print(leastIndex);
    }

    public static void subString(String word, String sub) {
        int wordPtr = 0;
        int subPtr = 0;

        while (true) {
            if (wordPtr == word.length()) {
                break;
            }

            if (subPtr == 0 && word.charAt(wordPtr) == sub.charAt(subPtr)) {
                leastIndex = wordPtr;
            }

            if (word.charAt(wordPtr) == sub.charAt(subPtr)) {
                subPtr++;
            } else {
                subPtr = 0;
            }

            wordPtr++;
        }
    }
}