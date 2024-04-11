import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len = a.length();

        int cnt = 0;
        for (int i = 0; i < len - 3; i++) {
            if (a.charAt(i) == '(' && a.charAt(i+1) == '(') {
                for (int j = i+2; j < len-1; j++) {
                    if (a.charAt(j) == ')' && a.charAt(j + 1) == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}