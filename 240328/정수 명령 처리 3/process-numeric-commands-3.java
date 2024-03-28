import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dp = new ArrayDeque<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String inst = sc.next();
            if (inst.equals("push_front")) {
                int num = sc.nextInt();
                dp.addFirst(num);
            }
            if (inst.equals("push_back")) {
                int num = sc.nextInt();
                dp.addLast(num);
            }
            if (inst.equals("pop_front")) {
                System.out.println(dp.pollFirst());
            }
            if (inst.equals("pop_back")) {
                System.out.println(dp.pollLast());
            }
            if (inst.equals("size")) {
                System.out.println(dp.size());
            }
            if (inst.equals("empty")) {
                System.out.println(dp.isEmpty() ? 1 : 0);
            }
            if (inst.equals("front")) {
                System.out.println(dp.peekFirst());
            }
            if (inst.equals("back")) {
                System.out.println(dp.peekLast());
            }
        }
    }
}