import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String subString = sc.next();

        int idx = -1;
        int subStringIdx = 0;
        for (int i = 0; i < word.length(); i++) {
            if (subStringIdx == subString.length()) {
                break;
            }

            if (word.charAt(i) == subString.charAt(subStringIdx)) {
                if (subStringIdx == 0) {
                    idx = i;    
                }
                subStringIdx++;
            } else {
                idx = -1;
                subStringIdx = 0;
            }
        }

        if (subStringIdx == subString.length()) {
            System.out.println(idx);
        } else {
            System.out.println(-1);
        }
    }
}