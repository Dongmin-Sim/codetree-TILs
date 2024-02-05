import java.util.Scanner;

public class Main {
    public static String text, pattern;

    public static boolean isSubStr(int startIdx){
        int n = text.length();
        int m = pattern.length();

        if (startIdx + m - 1 >= n) {
            return false;
        }

        for(int i = 0; i < m; i++) {
            if(text.charAt(startIdx + i) != pattern.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static int findIndex() {
        int n = text.length();
        for(int i = 0; i<n; i++) {
            if (isSubStr(i)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        text = sc.next(); pattern = sc.next();

        
        System.out.print(findIndex());
    }
}