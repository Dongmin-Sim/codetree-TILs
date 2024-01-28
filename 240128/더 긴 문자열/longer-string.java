import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next(), word2 = sc.next();

        if(word1.length() > word2.length()) {
            System.out.print(word1 + " " + word1.length());
        } else if(word1.length() == word2.length()){
            System.out.print("same");
        } else {
            System.out.print(word2 + " " + word2.length());
        }
    }
}