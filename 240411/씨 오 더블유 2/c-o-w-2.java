import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();

        int cnt = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'C') {
                for (int j = i+1; j < str.length()-1; j++) {
                    if (str.charAt(j) == 'O') {
                        for (int k = j; k < str.length(); k++) {
                            if (str.charAt(k) == 'W') {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}