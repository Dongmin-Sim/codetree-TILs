import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < n+1; i++) {
            q.add(i);
        }
        
        while (q.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                q.add(q.peek());
                q.poll();
            }
            System.out.println(q.poll());
        }
        System.out.println(q.poll());
    }
}