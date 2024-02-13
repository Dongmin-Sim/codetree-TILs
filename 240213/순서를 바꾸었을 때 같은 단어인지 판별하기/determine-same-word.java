import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(isSame(a, b)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isSame(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        for(int i = 0; i < a.length(); i++) {
            if(aChar[i] != bChar[i]) {
                return false;
            }
        }
        return true;
    }
}