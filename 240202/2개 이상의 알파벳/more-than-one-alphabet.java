import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if(isDifferent(word)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isDifferent(String word) {
        char c = word.charAt(0);

        for(int i = 1; i < word.length(); i++) {
            if(c != word.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}