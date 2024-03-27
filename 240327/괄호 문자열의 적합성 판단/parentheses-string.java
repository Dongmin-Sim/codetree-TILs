import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            String newStr = String.valueOf(str.charAt(i));

            if (newStr.equals("(")) {
                stack.push(newStr);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("No");
                    return;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}