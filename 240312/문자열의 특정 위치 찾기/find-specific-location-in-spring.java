import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String alpha = sc.next();

        int index = word.indexOf(alpha);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No");
        }
    }
}