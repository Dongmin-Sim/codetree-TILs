import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String inst = sc.next();
            if (inst.equals("push")) {
                stack.push(sc.nextInt());
            }
            if (inst.equals("size")) {
                System.out.println(stack.size());
            }
            if (inst.equals("pop")) {
                System.out.println(stack.pop());
            }
            if (inst.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1:0);
            }
            if (inst.equals("top")) {
                System.out.println(stack.peek());
            }
        }
    }
}