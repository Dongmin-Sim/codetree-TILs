import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] words = new String[10];


        for (int i = 0; i < 10; i++) {
            words[i] = sc.next();
        }

        char alphabet = sc.next().charAt(0);
        boolean isExist = false;
        for (int i = 0; i < 10; i++) {
            String word = words[i];

            if (alphabet == word.charAt(word.length() - 1)) {
                System.out.println(word);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("None");
        }
    }
}