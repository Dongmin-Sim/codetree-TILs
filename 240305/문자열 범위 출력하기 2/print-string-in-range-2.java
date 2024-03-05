import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = sc.nextInt();


        for (int i = word.length() - 1; i >= 0; i--) {
            if (i < word.length() - n) {
                break;
            }
            System.out.print(word.charAt(i));
        }
    }
}