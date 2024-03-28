import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String inst = sc.next();
            if (inst.equals("push")) {
                int num = sc.nextInt();
                q.add(num);
            }
            if (inst.equals("pop")) {
                System.out.println(q.poll());
            }
            if (inst.equals("size")) {
                System.out.println(q.size());
            }
            if (inst.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            if (inst.equals("front")) {
                System.out.println(q.peek());
            }
        }
    }
}