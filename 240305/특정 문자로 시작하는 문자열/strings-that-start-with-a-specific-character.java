import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        char alpha = sc.next().charAt(0);

        int cnt = 0;
        double lenSum = 0;

        for (int i = 0; i < n; i++) {
            String word = words[i];

            if (alpha == word.charAt(0)) {
                cnt++;
                lenSum += word.length();
            }
        }

        System.out.printf("%d %.2f", cnt, (lenSum / cnt));
    }
}