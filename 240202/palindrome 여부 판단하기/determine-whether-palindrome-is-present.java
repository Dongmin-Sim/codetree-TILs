import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean result = isPalindrome(word);

        if(result) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();
        for(int i = 0; i < len/2; i++){
            if(word.charAt(i) != word.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
}